package FoodRequest;

public class User {

	
	public String foodPrice(double payment) {
		
		if(payment<5.00) {
			return "Unavailbe Item";
		}
		else if(payment<=6.00) {
			return "Tea";
		}
		else if(payment<=8.00) {
			return "Coffee";
		}
		else if(payment<=10.00) {
			return "Cake and Banana";
		}
		else if(payment<=15.00) {
			return "Bread and Carry";
		}
		else if(payment<=20.00) {
			return "4 Singara";
		}
		else if(payment<=25.00) {
			return "Burger";
		}
		else if(payment<=30.00) {
			return "Rice with Carry";
		}
		else if(payment<=35.00) {
			return "Rice with Fish";
		}
		else if(payment<=40.00) {
			return "Rice with Chicken";
		}
		else if(payment<=45.00) {
			return "Rice with Beef";
		}
		else {
			return "Package";
		}
	}
}
