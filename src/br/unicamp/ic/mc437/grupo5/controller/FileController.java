package br.unicamp.ic.mc437.grupo5.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unicamp.ic.mc437.grupo5.model.TestFile;
import br.unicamp.ic.mc437.grupo5.process.FileProcess;


@Controller
@RequestMapping("/file")
public class FileController {
	
	@RequestMapping("/upload")
	public String loadUploadPage(){
		return "/file/upload";
	}
	
	@RequestMapping("/view")
	public String loadViewFilesListPage(/*@RequestParam String user*/ Model model){
		//TODO uncomment parameter from method and let it be read from user
		String user = "TestUser";
		FileProcess fileProcess = new FileProcess();
		List<TestFile> sharedFilesList = fileProcess.getFilesSharedWith(user);
		List<TestFile> ownedFilesList =fileProcess.getFilesOwnedBy(user);
		
		model.addAttribute("username", user);
		model.addAttribute("sharedFilesList", sharedFilesList);
		model.addAttribute("ownedFilesList", ownedFilesList);

		return "/file/view";
	}

}
