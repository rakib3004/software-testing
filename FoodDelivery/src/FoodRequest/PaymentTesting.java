package FoodRequest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaymentTesting {

	@Test
	public void test() {
		User user = new User();
		
		String actualFoodItem = user.foodPrice(33.00);
		
		String expectedFoodItem = "Rice with Fish";
		
		assertEquals(expectedFoodItem,actualFoodItem);
	}
	
	public void test2() {
		User user = new User();
		
		String actualFoodItem = user.foodPrice(9.00);
		
		String expectedFoodItem = "Rice with Chicken";
		
		assertEquals(expectedFoodItem,actualFoodItem);
	}
	
	public void test3() {
		User user = new User();
		
		String actualFoodItem = user.foodPrice(10.00);
		
		String expectedFoodItem = "Cake and Banana";
		
		assertEquals(expectedFoodItem,actualFoodItem);
	}

}
