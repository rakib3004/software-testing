package EquvalanceTesting;

public class ProgrammerRating {
	
	public double calculateRating(double codeForceRating, double codeChefRating, double leetCodeRating) {
		double programmerRating=0.0;
		
	boolean valideContestant = calculateValideRating(codeForceRating,codeChefRating,leetCodeRating);
	
	if(valideContestant==true) {
		
		programmerRating=calculateBestRating(codeForceRating,codeChefRating,leetCodeRating);
		
		return programmerRating;
	}
	else {
		return -1.0;
	}
		
	}

	public boolean calculateValideRating(double codeForceRating, double codeChefRating, double leetCodeRating) {
		
		
		if((codeForceRating>1500&&codeForceRating<3000)&&(codeChefRating>1500&&codeChefRating<3000)&&(leetCodeRating>1500&&leetCodeRating<3000)) {
			return true;
		}
		else {
			return false;

		}
		
}
	
	
	public double calculateBestRating(double codeForceRating, double codeChefRating, double leetCodeRating) {
		
		double tempPerformance = 0.0;

		
		double bestPerformance = 0.0;
		
		tempPerformance = Math.max(codeForceRating, codeChefRating);
		bestPerformance = Math.max(tempPerformance, leetCodeRating);
		
		return bestPerformance;
		
}
	
	
	
}
