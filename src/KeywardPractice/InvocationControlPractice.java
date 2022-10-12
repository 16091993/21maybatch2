package KeywardPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationControlPractice {
	
	@BeforeClass
	public void lonchbrowser() {
		System.out.println("Browser is launch");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Browser is close");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login the Applaction");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout the Applaction");
	}
	@Test(priority=1)
	public void homepage() {
		System.out.println("to chkaing the homepage");
	}
	@Test(priority=2,invocationCount = 5)
	public void notification() {
		System.out.println("To chake the notification page of the application");
	}
	

}
