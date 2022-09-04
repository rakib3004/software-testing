package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AcceptanceUnit {
	
	
	

	public void test1() {
		RangeCheck rangeCheck = new RangeCheck();

		boolean expectedResponse= true;
		
		boolean actualResponse = rangeCheck.requestAcceptance(2500, 100);
		
		assertEquals(expectedResponse,actualResponse);
	
	}
	public void test2() {
		RangeCheck rangeCheck = new RangeCheck();

		boolean expectedResponse= true;
		
		boolean actualResponse = rangeCheck.requestAcceptance(2500, 200);
		
		assertEquals(expectedResponse,actualResponse);
	


		
	}

	
	public void test3() {
		RangeCheck rangeCheck = new RangeCheck();

		boolean expectedResponse= true;
		
		boolean actualResponse = rangeCheck.requestAcceptance(2500, 199);
		
		assertEquals(expectedResponse,actualResponse);
		



		
	}

	
	public void test4() {
		RangeCheck rangeCheck = new RangeCheck();

		boolean expectedResponse= true;
		
		boolean actualResponse = rangeCheck.requestAcceptance(2500, 50);
		
		assertEquals(expectedResponse,actualResponse);



		
	}

	
	public void test5() {
		RangeCheck rangeCheck = new RangeCheck();

		boolean expectedResponse= true;
		
		boolean actualResponse = rangeCheck.requestAcceptance(2500, 51);
		
		assertEquals(expectedResponse,actualResponse);

		
	}

	
	public void test6() {
		RangeCheck rangeCheck = new RangeCheck();

		boolean expectedResponse= true;
		
		boolean actualResponse = rangeCheck.requestAcceptance(5000, 100);
		
		assertEquals(expectedResponse,actualResponse);

		
	}

	
	public void test7() {
		RangeCheck rangeCheck = new RangeCheck();

		boolean expectedResponse= true;
		
		boolean actualResponse = rangeCheck.requestAcceptance(4999, 100);
		
		assertEquals(expectedResponse,actualResponse);


		
	}

	
	public void test8() {
		RangeCheck rangeCheck = new RangeCheck();

		boolean expectedResponse= true;
		
		boolean actualResponse = rangeCheck.requestAcceptance(500, 100);
		
		assertEquals(expectedResponse,actualResponse);
		
	}

	
	public void test9() {
		RangeCheck rangeCheck = new RangeCheck();

		boolean expectedResponse= true;
		
		boolean actualResponse = rangeCheck.requestAcceptance(501, 100);
		
		assertEquals(expectedResponse,actualResponse);
		
	}
	

}
