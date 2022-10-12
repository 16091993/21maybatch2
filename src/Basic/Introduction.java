package Basic;

import org.testng.annotations.Test;

public class Introduction {
	
	// Testng wil give the  prefrence to alphabetical order.
	@Test(priority=1)
	public void openurl() {
		System.out.println("Url is open");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("login the webpage to website");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("logout the webpage to website");
	}

}
