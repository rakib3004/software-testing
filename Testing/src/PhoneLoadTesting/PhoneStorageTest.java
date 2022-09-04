package PhoneLoadTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PhoneStorageTest {

	@Test
	void test() {
		PhoneStorage user1Phone = new PhoneStorage();
		
		double user1Storage = user1Phone.findHarmfulFolderSize(4.0,7.0,8.0,5.0);
		
		assertEquals(8.0,user1Storage);
	}
	
	@Test
	void test1() {
		PhoneStorage user1Phone = new PhoneStorage();
		
		double user1Storage = user1Phone.findHarmfulFolderSize(1.0,7.0,8.0,5.0);
		
		assertEquals(-1,user1Storage);
	}
	
	
	@Test
	void test2() {
		PhoneStorage user1Phone = new PhoneStorage();
		
		double user1Storage = user1Phone.findHarmfulFolderSize(20.0,7.0,8.0,5.0);
		
		assertEquals(-1,user1Storage);
	}
	
	
	@Test
	void test3() {
		PhoneStorage user1Phone = new PhoneStorage();
		
		double user1Storage = user1Phone.findHarmfulFolderSize(4.0,1.0,8.0,5.0);
		
		assertEquals(-1,user1Storage);
	}
	
	
	@Test
	void test4() {
		PhoneStorage user1Phone = new PhoneStorage();
		
		double user1Storage = user1Phone.findHarmfulFolderSize(4.0,20.0,8.0,5.0);
		
		assertEquals(-1,user1Storage);
	}
	
	
	@Test
	void test5() {
		PhoneStorage user1Phone = new PhoneStorage();
		
		double user1Storage = user1Phone.findHarmfulFolderSize(4.0,7.0,1.0,5.0);
		
		assertEquals(-1,user1Storage);
	}
	
	@Test
	void test6() {
		PhoneStorage user1Phone = new PhoneStorage();
		
		double user1Storage = user1Phone.findHarmfulFolderSize(4.0,7.0,20.0,5.0);
		
		assertEquals(-1,user1Storage);
	}
	
	@Test
	void test7() {
		PhoneStorage user1Phone = new PhoneStorage();
		
		double user1Storage = user1Phone.findHarmfulFolderSize(4.0,7.0,8.0,1.0);
		
		assertEquals(-1,user1Storage);
	}
	
	@Test
	void test8() {
		PhoneStorage user1Phone = new PhoneStorage();
		
		double user1Storage = user1Phone.findHarmfulFolderSize(4.0,7.0,8.0,20.0);
		
		assertEquals(-1,user1Storage);
	}
	

}
