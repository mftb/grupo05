package br.unicamp.ic.mc437.grupo05.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.unicamp.ic.mc437.grupo05.modelo.TestFile;
import br.unicamp.ic.mc437.grupo05.process.FileProcess;

@Resource
@Path("/file")
public class FileController {

	@Path("/list")
	public void list() {
	}

	@Path("/upload")
	public void upload() {
	}

	@Path("/view")
	public void view() {
		String user = "TestUser";
		FileProcess fileProcess = new FileProcess();
		List<TestFile> sharedFilesList = fileProcess.getFilesSharedWith(user);
		List<TestFile> ownedFilesList = fileProcess.getFilesOwnedBy(user);

		// model.addAttribute("username", user);
		// model.addAttribute("sharedFilesList", sharedFilesList);
		// model.addAttribute("ownedFilesList", ownedFilesList);
	}

}
