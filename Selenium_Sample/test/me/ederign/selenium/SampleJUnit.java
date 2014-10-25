package me.ederign.selenium;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class SampleJUnit {
	
	@Test(expected=RuntimeException.class)
	public void sampleException(){
		//Teste test = new Teste();
		//alguma regra que DA EXCECAO
		
		//assertEquals(true, test.exception());
	}

}
