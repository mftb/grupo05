package br.unicamp.ic.mc437.s22014.grupo5.parser.test;

import java.util.List;

import br.unicamp.ic.mc437.s22014.grupo5.model.MutantInfo;
import br.unicamp.ic.mc437.s22014.grupo5.parser.Parser;

public class ParserUnitTest {
	public static void main(String args[]){
		
		String basePath = "resources/xml/";
		String fileName = "test1";
		Parser parser = new Parser(basePath, fileName);
		
		List<MutantInfo> values = parser.parseIntoMutantInfoObjects();
		
		for(MutantInfo i : values){
			System.out.println(i.toString());
		}
		System.out.println(values.size());
	}

}


