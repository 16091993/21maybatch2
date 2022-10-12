package KeywardPractice;

import org.testng.annotations.Test;

public class TimeOutKeywardPractice {
	
	@Test(priority=1,timeOut = 5000)
	public void homepage() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("to chkaing the homepage");
	}
	@Test(priority=2,invocationCount = 5)
	public void notification() {
		System.out.println("To chake the notification page of the application");
	}

}
