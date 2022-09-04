package EquvalanceTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgrammerRatingTest {

	@Test
	void test() {
		ProgrammerRating bsse1101Programmer = new ProgrammerRating();
		
		double bsse1101Rating = bsse1101Programmer.calculateRating(1700,2750,2300);
		
		assertEquals(2750,bsse1101Rating);
	}
	
	@Test
	void test1() {
		ProgrammerRating bsse1101Programmer = new ProgrammerRating();
		
		double bsse1101Rating = bsse1101Programmer.calculateRating(200,2750,2300);
		
		assertEquals(-1,bsse1101Rating);
	}
	
	
	@Test
	void test2() {
		ProgrammerRating bsse1101Programmer = new ProgrammerRating();
		
		double bsse1101Rating = bsse1101Programmer.calculateRating(5000,2750,2300);
		
		assertEquals(-1,bsse1101Rating);
	}
	
	
	@Test
	void test3() {
		ProgrammerRating bsse1101Programmer = new ProgrammerRating();
		
		double bsse1101Rating = bsse1101Programmer.calculateRating(1700,200,2300);
		
		assertEquals(-1,bsse1101Rating);
	}
	
	
	@Test
	void test4() {
		ProgrammerRating bsse1101Programmer = new ProgrammerRating();
		
		double bsse1101Rating = bsse1101Programmer.calculateRating(1700,5000,2300);
		
		assertEquals(-1,bsse1101Rating);
	}
	
	
	@Test
	void test5() {
		ProgrammerRating bsse1101Programmer = new ProgrammerRating();
		
		double bsse1101Rating = bsse1101Programmer.calculateRating(1700,2750,200);
		
		assertEquals(-1,bsse1101Rating);
	}
	
	@Test
	void test6() {
		ProgrammerRating bsse1101Programmer = new ProgrammerRating();
		
		double bsse1101Rating = bsse1101Programmer.calculateRating(1700,2750,5000);
		
		assertEquals(-1,bsse1101Rating);
	}
	

}
