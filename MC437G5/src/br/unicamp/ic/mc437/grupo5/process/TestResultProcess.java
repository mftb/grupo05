package br.unicamp.ic.mc437.grupo5.process;

import java.util.ArrayList;
import java.util.List;

import br.unicamp.ic.mc437.grupo5.model.TestResult;

public class TestResultProcess {

	public TestResultProcess(){
		
	}
	
	//TODO still a stub
	/**
	 * Retrieve the results to the test from file <code>file</code>.
	 * @param file
	 * @return
	 */
	public List<TestResult> getResultsForFile(String file){
		List<TestResult> mockupList = new ArrayList<TestResult>();
		for(int i=0; i<10; i++){
			TestResult newTestResult = new TestResult();
			newTestResult.setTestSet("set" + i);
			newTestResult.setTestCase("testCase" + i);
			newTestResult.setDataTestCount(i);
			newTestResult.setMutationOperator("operator" + i);
			newTestResult.setMutant("mutant" + i);
			newTestResult.setAlive(1);
			mockupList.add(newTestResult);
		}
		return mockupList;
	}
}
