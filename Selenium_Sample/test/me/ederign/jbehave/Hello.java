package me.ederign.jbehave;

public class Hello {

	private String name;

	public Hello(String name) {
		this.name = name;
	}

	public String hello() {
		return "Hello "+ name;
	}

}
