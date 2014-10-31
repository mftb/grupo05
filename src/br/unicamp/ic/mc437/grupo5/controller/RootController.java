package br.unicamp.ic.mc437.grupo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class RootController {

	@RequestMapping("/")
	public String loadHome(){
		return "redirect:/file/view";
	}
}
