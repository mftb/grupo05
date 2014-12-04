package br.unicamp.ic.mc437.grupo5.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unicamp.ic.mc437.grupo5.model.TestResult;
import br.unicamp.ic.mc437.grupo5.process.TestResultProcess;

@Controller
@RequestMapping("/test")
public class TestResultController {

	@RequestMapping("/results")
	public String showTestResultsForFile(/*@RequestParam String file*/ Model model){
		//TODO uncomment parameter from method and let it be read from user
		String file = "Generic File";
		TestResultProcess testResultProcess = new TestResultProcess();
		List<TestResult> testResultList = testResultProcess.getResultsForFile(file);
		
		model.addAttribute("fileName", file);
		model.addAttribute("testResultList", testResultList);
		
		return "/test/results";
		
	}
}
