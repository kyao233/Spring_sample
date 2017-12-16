package com.spring.Spring.output;

public class OutputHelper {

	private IOOutputGenerator gen = null;
	

	public void setGen(IOOutputGenerator gen) {
		this.gen = gen;
	}

	public void generateOutput() {
		gen.generateOutput();
	}
	

	
}
