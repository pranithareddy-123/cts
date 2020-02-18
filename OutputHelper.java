package com.cts.project123;

public class OutputHelper {
IOutputGenerator outputGenerator;
	
	public OutputHelper(){
		outputGenerator = new CsvOutputGenerator();
	}
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
	
}
