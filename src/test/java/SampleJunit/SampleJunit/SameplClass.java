package SampleJunit.SampleJunit;


import static org.junit.Assert.*;

import org.junit.Test;

public class SameplClass {

	String message = "SimpliLearn";
	
@Test
public void testPrintMessage() {
	System.out.println("Inside testprintMessage()");
	assertEquals(message,"SimpliLearn");
	
	
}
	public static void main(String[] args) {
		SameplClass sp = new SameplClass();
		sp.testPrintMessage();
		
	}
	
	
}
