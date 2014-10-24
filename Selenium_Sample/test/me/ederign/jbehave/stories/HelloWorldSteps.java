package me.ederign.jbehave.stories;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import me.ederign.jbehave.Hello;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class HelloWorldSteps {
	
	Hello hello;
	String result;
	
	@Given("a name $value")
	public void givenANameEder(@Named("value") String name) {
	  hello = new Hello(name);
	}

	@When("I ask for hello")
	public void whenIAskForHello() {
		result = hello.hello();
	}

	@Then("should receive $value")
	public void thenShouldReceiveHelloEder(@Named("value") String expected) {
	  assertThat(result, is(expected));
	}
}
