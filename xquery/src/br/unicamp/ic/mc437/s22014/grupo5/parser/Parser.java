package br.unicamp.ic.mc437.s22014.grupo5.parser;

import java.io.File;

import com.northconcepts.datapipeline.core.DataReader;
import com.northconcepts.datapipeline.xml.XmlReader;

public class Parser {

	/**
	 * Initialized into constructor with value of base path of files to be parsed for the application
	 */
	final String basePath;
	
	/**
	 * DataReader instance that parses XML, so we can extract desired fields.
	 */
    DataReader dataReader;

	/**
	 * Constructor
	 * @param basePath
	 * @param fileName - without .xml termination
	 */
	public Parser(String basePath, String fileName){
		this.basePath = basePath;
        this.dataReader = new XmlReader(new File(basePath + File.separator + fileName + ".xml"));
	}
	
	/**
	 * Reads the value from a xml field with XPAth = fieldPath 
	 * @param fieldPath
	 * @return String
	 */
	public String getField(String fieldPath){
		String field = "";
		
		return field;
	}
}
