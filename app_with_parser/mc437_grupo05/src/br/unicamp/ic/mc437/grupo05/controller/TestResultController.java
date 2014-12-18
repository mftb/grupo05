package br.unicamp.ic.mc437.grupo05.controller;

import java.util.List;

import org.springframework.ui.Model;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.unicamp.ic.mc437.grupo05.modelo.TestResult;
import br.unicamp.ic.mc437.grupo05.process.TestResultProcess;

@Resource
public class TestResultController {

	@Path("/results")
	public void results(Model model) {
		String file = "Generic File";
		TestResultProcess testResultProcess = new TestResultProcess();
		List<TestResult> testResultList = testResultProcess
				.getResultsForFile(file);

		model.addAttribute("fileName", file);
		model.addAttribute("testResultList", testResultList);
	}
}
