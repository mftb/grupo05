package br.unicamp.ic.mc437.grupo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/files")
public class FilesController {
	
	@RequestMapping("/upload")
	public String loadUploadPage(){
		return "/file/upload";
	}
}
