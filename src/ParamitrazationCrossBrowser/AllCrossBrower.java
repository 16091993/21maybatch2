package ParamitrazationCrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllCrossBrower {
	WebDriver driver;
	@Parameters("browser")
	@Test(priority=1)
	public void CrossBrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium all file\\chromedriver_win32 105\\chromedriver.exe");
		 driver = new ChromeDriver();
	   }else if(browser.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium all file\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
	   }else {
		   System.out.println("wrong browser selected");
	   }
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		


	
    }
	@Test(priority=2)
	public void verifyCurrentURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	@Test(priority=3)
	public void verifygetTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	@Test(priority=4)
	public void verifyUserNameField() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("manish");
	}
	@Test(priority=5)
	public void verifyPasswardField() {
		WebElement passward = driver.findElement(By.xpath("//input[@name='pass']"));
		Assert.assertTrue(passward.isDisplayed());
		passward.sendKeys("manish@123");
	}
	@Test(priority=6)
	public void clickloginbutton() {
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		Assert.assertTrue(loginbtn.isEnabled());
		loginbtn.click();
	}

}
