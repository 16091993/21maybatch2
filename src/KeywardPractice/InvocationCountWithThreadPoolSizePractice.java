package KeywardPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountWithThreadPoolSizePractice {
	
	@Test(invocationCount = 5,threadPoolSize = 5)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium all file\\chromedriver_win32 105\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	    driver.close();
	}


}
