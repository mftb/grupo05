package br.unicamp.ic.mc437.s22014.grupo5.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.unicamp.ic.mc437.s22014.grupo5.model.MutantInfo;
import br.unicamp.ic.mc437.s22014.grupo5.model.TestResult;

import com.northconcepts.datapipeline.core.DataReader;
import com.northconcepts.datapipeline.core.Record;
import com.northconcepts.datapipeline.xml.XmlReader;

public class Parser {
	
	/* FIELDS FROM XML TO BE READ */
	
	/**
	 * ID
	 */
	private final String testId = "iTestResult/_imutants/@path";
	/**
	 * Cod
	 */
	private final String testCod = "iTestResult/testSetResults/@cod";
	/**
	 * Nome do caso de teste
	 */
	private final String testCaseName = "iTestResult/testSetResults/testCaseResults/@path";
	/**
	 * #OPERADOR DE MUTACAO - ainda precisamos tratar essa string apos reaver esse campo
	 */
	private final String mutationOperators = "iTestResult/testSetResults/testCaseResults/testCaseExecutingOutput_MutantList/@mutantKey";
	/**
	 * Vivo?
	 */
	private final String isAlive = "iTestResult/testSetResults/testCaseResults/testCaseExecutingOutput_MutantList/dead/text()";
	/**
	 * Falha
	 */
	private final String hasFailed = "iTestResult/testSetResults/testCaseResults/testCaseExecutingOutput_MutantList/evalFailed/text()";

	/* configuration attributes */
	
	/**
	 * Initialized into constructor with value of base path of files to be parsed for the application
	 */
	private final String basePath;
	
	/**
	 * DataReader instance that parses XML, so we can extract desired fields.
	 */
	private DataReader dataReader;

	/**
	 * Constructor
	 * @param basePath
	 * @param fileName - without .xml termination
	 */
	public Parser(String basePath, String fileName){
		this.basePath = basePath;
        this.dataReader = new XmlReader(new File(basePath + File.separator + fileName + ".xml"))
        .addField("hasFailed", this.hasFailed)
        .addField("isDead", this.isAlive)
        .addRecordBreak("iTestResult/testSetResults/testCaseResults/testCaseExecutingOutput_MutantList");
	}
	
	/**
	 * Reads the value from a xml field with XPAth = fieldPath 
	 * @param fieldPath
	 * @return String
	 */
	private List<MutantInfo> getField(String fieldPath){
		List<MutantInfo> fields = new ArrayList<MutantInfo>();
		this.dataReader.open();
		Record record;
        while ((record = dataReader.read()) != null) {
        	MutantInfo mutantInfo = new MutantInfo();
            mutantInfo.setHasFailed(record.getField("hasFailed").getValueAsString());
            mutantInfo.setIsDead(record.getField("isDead").getValueAsString());
            fields.add(mutantInfo);
        }
		return fields;
	}
	
	public List<MutantInfo> parseIntoMutantInfoObjects(){
		return this.getField("");
	}
//	public TestResult parseIntoTestFileObject(){
//		TestResult testResult = new TestResult();
//		testResult.setTestSet(getField(this.testId));
//		testResult.setTestCase(getField(this.testCaseName));
//		testResult.setDataTestCount(-1);
//		testResult.setMutationOperator(getField(this.mutationOperators));
//		testResult.setMutant(getField("??"));
//		testResult.setAlive(-1);
//		return testResult;
//	}
	
//	private void parseXmlFields(){
//		 DataReader reader1 = new XmlReader(new File("resources/xml/persons.xml"))
//         .addField("uri", "/Persons/Person/@uri")
//         .addField("name", "/Persons/Person/@name")
//         .addField("hometown", "/Persons/Person/@hometown")
//         .addRecordBreak("/Persons/Person");
//         .addField("uri", "/Persons/Person/@uri")
//         .addField("name", "/Persons/Person/@name")
//         .addField("hometown", "/Persons/Person/@hometown")
//         .addRecordBreak("/Persons/Person");
//	}
}
