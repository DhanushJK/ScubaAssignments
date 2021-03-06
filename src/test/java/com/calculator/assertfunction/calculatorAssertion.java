package com.calculator.assertfunction;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.calculator.Calculator;
import com.calculator.Dataproviders.calculatorData;
import com.maveric.core.utils.reporter.Report;

public class calculatorAssertion {
	
	@BeforeClass
	public void classSetUp() {
		System.out.println("Calculator Operations");
	
	}
	
	@BeforeMethod
	public void methodSetUp() {
		System.out.println("Pass New values for Assertions");
	
	}
	
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
	
	@Test (dataProvider="divRealData", 
			dataProviderClass = calculatorData.class, 
			groups= "intermittent_calculation")
	public void calcDivReal(int number1,int number2, double expected_result) {
		System.out.println("Running Test - calcDivision");
		Calculator obj = new Calculator();
		double result = obj.divReal(number1, number2);
		Assert.assertFalse(result == expected_result, "False | Output success");
		Report.log("Actual - "+ result + " Expected - "+expected_result);
	
	}
	
	@Test (dataProvider="exponentData", 
			dataProviderClass = calculatorData.class, 
			groups= "intermittent_calculation")
	public void calcExponent(double number1,double number2, double expected_result) {
		System.out.println("Running Test - calcExponent");
		Calculator obj = new Calculator();
		double result = obj.exp(number1, number2);
		Assert.assertTrue(result == expected_result, "True | Output success");
		Report.log("Actual - "+ result + " Expected - "+expected_result);
		
	}
	
	@Test (dataProvider="modulusData", 
			dataProviderClass = calculatorData.class, 
			groups= "intermittent_calculation")
	public void calcModulus(int number1,int number2, int expected_result) {
		System.out.println("Running Test - calcModulus");
		Calculator obj = new Calculator();
		int result = obj.mod(number1, number2);
		Assert.assertEquals(result, expected_result);
		Report.log("Actual - "+ result + " Expected - "+expected_result);
	
	}
	
	@Test (dataProvider="inverseData", 
			dataProviderClass = calculatorData.class,
			groups= "intermittent_calculation")
	public void calcInverse(int number1, double expected_result) {
		System.out.println("Running Test - calcInverse");
		Calculator obj = new Calculator();
		double result = obj.inverse(number1);
		Assert.assertNotEquals(result,expected_result);
		Report.log("Actual - "+ result + " Expected - "+expected_result);
	
	}
	
	@Test (dataProvider="negateData", 
			dataProviderClass = calculatorData.class, 
			groups= "intermittent_calculation")
	public void calcNegate(int number1, int expected_result) {
		System.out.println("Running Test - calcNegate");
		Calculator obj = new Calculator();
		int result = obj.negate(number1);
		Assert.assertEquals(result, expected_result);
		Report.log("Actual - "+ result + " Expected - "+expected_result);
	
	}
	
	
	@AfterMethod
	public void afterMethodSetUp() {
		System.out.println("Verify Results");
	
	}
	
	@AfterClass
	public void afterClassSetUp() {
		System.out.println("Execution Done || Thanks .. ");
	
	}
}
