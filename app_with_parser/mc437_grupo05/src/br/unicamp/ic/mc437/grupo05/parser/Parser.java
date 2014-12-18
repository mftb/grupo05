package br.unicamp.ic.mc437.grupo05.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import br.unicamp.ic.mc437.grupo05.modelo.MutantInfo;

import com.northconcepts.datapipeline.core.DataReader;
import com.northconcepts.datapipeline.core.Record;
import com.northconcepts.datapipeline.xml.XmlReader;

public class Parser {
	
	/* FIELDS FROM XML TO BE READ */
	
	/**
	 * ID
	 */
	private final String testId = "iTestResult/testSetResults/path/text()";
	/**
	 * Cod
	 */
	private final String testCode = "iTestResult/testSetResults/cod/text()";
	/**
	 * Nome do caso de teste
	 */
	private final String testCaseName = "iTestResult/testSetResults/testCaseResults/path/text()";
	/**
	 * #OPERADOR DE MUTACAO - ainda precisamos tratar essa string apos reaver esse campo
	 */
	private final String mutationOperators = "iTestResult/testSetResults/testCaseResults/testCaseExecutingOutput_MutantList/mutantKey/text()";
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
	 * Initialized into constructor; id of file to be parsed (foreign key)
	 */
	private final Long fileId;

	private final Reader inputStreamReader;

	/**
	 * Constructor
	 * @param basePath
	 * @param fileName - without .xml termination
	 */
	public Parser(Reader reader, Long fileId){
		this.fileId = fileId;
		inputStreamReader = reader;
		
	}
	
	
	public List<MutantInfo> parseIntoMutantInfoObjects(){
		List<MutantInfo> outerFields = this.getOuterFields();
		List<MutantInfo> middleFields = this.getMiddleFields();
		List<MutantInfo> innerFields = this.getInnerFields();
		
		int outerSize = outerFields.size();
		int middleSize = middleFields.size();
		int innerSize = innerFields.size();
       
		for(int i=0; i<innerSize; i++){
			innerFields.get(i).setTestCaseName(middleFields.get(i/(innerSize/middleSize)).getTestCaseName());
			innerFields.get(i).setTestCode(outerFields.get(i/(innerSize/outerSize)).getTestCode());
			innerFields.get(i).setTestId(outerFields.get(i/(innerSize/outerSize)).getTestId());	
			innerFields.get(i).setFileId(this.fileId);
		}
		return innerFields;
	}

	private List<MutantInfo> getInnerFields(){
		//DataReader dataReader = new XmlReader(new File(basePath + File.separator + fileName + ".xml"))
		DataReader dataReader = new XmlReader(this.inputStreamReader)
		.addField("hasFailed", this.hasFailed)
        .addField("isDead", this.isAlive)
        .addField("mutationOperators", mutationOperators)
        .addRecordBreak("iTestResult/testSetResults/testCaseResults/testCaseExecutingOutput_MutantList");		

		List<MutantInfo> fields1 = new ArrayList<MutantInfo>();

		dataReader.open();
		
		Record record1;
		
		while ((record1 = dataReader.read()) != null) {
        	MutantInfo mutantInfo = new MutantInfo();
            mutantInfo.setHasFailed(record1.getField("hasFailed").getValueAsString());
            mutantInfo.setIsAlive(record1.getField("isDead").getValueAsString());
            mutantInfo.setMutationOperators(record1.getField("mutationOperators").getValueAsString());
            fields1.add(mutantInfo);
        }

		dataReader.close();

		return fields1;
		
	}
	
	private List<MutantInfo> getMiddleFields(){

		//DataReader dataReader = new XmlReader(new File(basePath + File.separator + fileName + ".xml"))
		DataReader dataReader = new XmlReader(this.inputStreamReader)
			.addField("testCaseName", testCaseName)
			.addRecordBreak("iTestResult/testSetResults/testCaseResults");
		
		List<MutantInfo> fields1 = new ArrayList<MutantInfo>();

		
		dataReader.open();
		
		Record record1; //= dataReader.read();
		
		 while ((record1 = dataReader.read()) != null) {
        	MutantInfo mutantInfo = new MutantInfo();
            mutantInfo.setTestCaseName(record1.getField("testCaseName").getValueAsString());
            fields1.add(mutantInfo);
        }
		dataReader.close();

		return fields1;
	}
	
	private List<MutantInfo> getOuterFields(){

		//DataReader dataReader = new XmlReader(new File(basePath + File.separator + fileName + ".xml"))
		DataReader dataReader = new XmlReader(this.inputStreamReader)
			.addField("testCode", testCode)
	        .addField("testId", testId)
	     	.addRecordBreak("iTestResult/testSetResults");
		
		List<MutantInfo> fields1 = new ArrayList<MutantInfo>();

		dataReader.open();
		
		Record record1;
		
		 while ((record1 = dataReader.read()) != null) {
        	MutantInfo mutantInfo = new MutantInfo();
            mutantInfo.setTestId(record1.getField("testId").getValueAsString());
            mutantInfo.setTestCode(record1.getField("testCode").getValueAsString());
            fields1.add(mutantInfo);
        }
		dataReader.close();
		return fields1;
	}
}
