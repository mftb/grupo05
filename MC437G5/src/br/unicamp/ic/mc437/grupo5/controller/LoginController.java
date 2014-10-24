package br.unicamp.ic.mc437.grupo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class LoginController {

	@RequestMapping("/login")
	public String getLoginPage(){
		return "/auth/login";
	}
}
