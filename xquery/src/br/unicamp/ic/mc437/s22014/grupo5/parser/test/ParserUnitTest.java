package br.unicamp.ic.mc437.s22014.grupo5.parser.test;

import br.unicamp.ic.mc437.s22014.grupo5.parser.Parser;

public class ParserUnitTest {
	public static void main(String args[]){
		
		String basePath = "resources/xml/";
		String fileName = "test1";
		Parser parser = new Parser(basePath, fileName);
		
		String value = parser.getField("bla");
	}
}
