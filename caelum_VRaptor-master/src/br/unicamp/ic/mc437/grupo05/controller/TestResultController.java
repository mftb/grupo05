package br.unicamp.ic.mc437.grupo05.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.vraptor.Resource;
import br.unicamp.ic.mc437.grupo05.modelo.TestResult;
import br.unicamp.ic.mc437.grupo05.process.TestResultProcess;

@Resource
public class TestResultController {

	@RequestMapping("/results")
	public String showTestResultsForFile(
			/* @RequestParam String file */Model model) {
		// TODO uncomment parameter from method and let it be read from user
		String file = "Generic File";
		TestResultProcess testResultProcess = new TestResultProcess();
		List<TestResult> testResultList = testResultProcess
				.getResultsForFile(file);

		model.addAttribute("fileName", file);
		model.addAttribute("testResultList", testResultList);

		return "/test/results";

	}
}
