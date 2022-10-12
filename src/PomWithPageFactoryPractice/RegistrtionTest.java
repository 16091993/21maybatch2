package PomWithPageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrtionTest {
	
	// Browser setup ==> validations apply ==> browser close.
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium all file\\chromedriver_win32 105\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@AfterClass
	public void teardown() {
		//driver.close();
	}
	@Test
	public void FacebookregistrationPageTest_Positive() {
		RegistrtionPage rp = new RegistrtionPage(driver);
		rp.ClickFacebookSignupLink();
		rp.VerifyFacebookRegistrationPageFBLogo();
		rp.VerifyFacebookRegistrationPageAlreadyAccount();
		rp.SetFacebookRegistrationPageFristName("ABC");
		rp.setFacebookRegstrationPageLastName();
		rp.SetFacebookRegistrationPageMobileEmail();
		rp.SetFacebookRegistrationPagePassward();
		rp.SetFacebookRegistrationPageBirthday();
		rp.SetFacebookRegistrationPageBirthMonth();
		rp.SetFacebookRegistrationPageBirthyear();
		rp.SsetFacebookRegistrationPageGender("male");
		rp.ClickFacebookRegistrationPageSubmitButton();
		
	}
	
				

}
