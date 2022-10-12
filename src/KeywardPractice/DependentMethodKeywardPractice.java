package KeywardPractice;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DependentMethodKeywardPractice {
	
	@Test(priority = 1)
	public void OpenURL() {
		System.out.println("Open the URL");
		Assert.fail();
	}
	@Test(priority = 2,dependsOnMethods = "OpenURL")
	public void login() {
		System.out.println("login Application");
	}
	@Test(priority = 3,dependsOnMethods = {"OpenURL","login"})
	public void logout() {
		System.out.println("logout Applaction");
	}

}
