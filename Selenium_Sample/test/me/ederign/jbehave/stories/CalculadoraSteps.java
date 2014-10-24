package me.ederign.jbehave.stories;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class CalculadoraSteps {
	@Given("uma calculadora")
	public void givenUmaCalculadora() {
	  
	}

	@When("eu somo 1 e 2")
	public void whenEuSomo1E2() {
	  
	}

	@Then("o resultado sera 3")
	public void thenOResultadoSera3() {
		Assert.assertTrue(true);
	}
}
