package br.unicamp.ic.mc437.grupo05.controller;

import java.util.List;

import org.springframework.ui.Model;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.unicamp.ic.mc437.grupo05.modelo.TestFile;
import br.unicamp.ic.mc437.grupo05.process.FileProcess;

@Resource
@Path("/file")
public class FileController {

	@Post("/upload")
	public String loadUploadPage() {
		return "/file/upload";
	}

	@Post("/view")
	public String loadViewFilesListPage(
			/* @RequestParam String user */Model model) {
		// TODO uncomment parameter from method and let it be read from user
		String user = "TestUser";
		FileProcess fileProcess = new FileProcess();
		List<TestFile> sharedFilesList = fileProcess.getFilesSharedWith(user);
		List<TestFile> ownedFilesList = fileProcess.getFilesOwnedBy(user);

		model.addAttribute("username", user);
		model.addAttribute("sharedFilesList", sharedFilesList);
		model.addAttribute("ownedFilesList", ownedFilesList);

		return "/file/view";
	}

}
