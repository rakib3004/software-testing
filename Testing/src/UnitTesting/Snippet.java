package UnitTesting;

public class Snippet {
	@Test
	void test() {
		ProgrammerRating bsse1101Programmer = new ProgrammerRating();
		
		double bsse1101Rating = bsse1101Programmer.calculateRating(1800,1800,1800);
		
		assertEquals(1800,bsse1101Rating);
	}
}

