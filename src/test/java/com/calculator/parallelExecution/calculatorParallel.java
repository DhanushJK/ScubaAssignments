package com.calculator.parallelExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.calculator.Calculator;
import com.calculator.Dataproviders.calculatorData;
import com.maveric.core.utils.reporter.Report;

public class calculatorParallel {
	
	@Test (dataProvider="additionData", 
			dataProviderClass = calculatorData.class, 
			groups= "basic_calculation")
	public void calcAddition(int number1,int number2, int expected_result) {
		System.out.println("Running Test - calcAddition");
		Calculator obj = new Calculator();
		int result = obj.add(number1, number2);
		Assert.assertEquals(result, expected_result);
		Report.log("Actual - "+ result + " Expected - "+expected_result);
	}
	
	@Test (dataProvider="subractionData", 
			dataProviderClass = calculatorData.class, 
			groups= "basic_calculation")
	public void calcSubraction(int number1,int number2, int expected_result) {
		System.out.println("Running Test - calcSubraction");
		Calculator obj = new Calculator();
		int result = obj.sub(number1, number2);
		Report.log("Actual - "+ result + " Expected - "+expected_result);
	}
	
	@Test (dataProvider="multiplyData", 
			dataProviderClass = calculatorData.class, 
			groups= "basic_calculation")
	public void calcMultiplication(int number1,int number2, int expected_result) {
		System.out.println("Running Test - calcMultiplication");
		Calculator obj = new Calculator();
		int result = obj.mul(number1, number2);
		Report.log("Actual - "+ result + " Expected - "+expected_result);
	
	}
	
	@Test (dataProvider="divIntData", 
			dataProviderClass = calculatorData.class, 
			groups= "basic_calculation")
	public void calcDivInt(int number1,int number2, int expected_result) {
		System.out.println("Running Test - calcDivisionInt");
		Calculator obj = new Calculator();
		int result = obj.divInt(number1, number2);
		Report.log("Actual - "+ result + " Expected - "+expected_result);
	
	}

}
