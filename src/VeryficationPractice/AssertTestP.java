package VeryficationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertTestP {
	
	// Example :-  To verify the check box is selected or not.
//	public static void main(String[] args) {
//			
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium all file\\chromedriver_win32 105\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//			
//		WebElement rv = driver.findElement(By.xpath("mention the xpath"));
//			
//		if (rv.isSelected()==true) {
//			System.out.println("Check box is selected");
//		}else {
//			System.out.println("Check box is not selected");
//		}
//			
//	}
	//1. assertEquals():- It is used to verify expected  and actual results. If both are same then output is pass otherwise fail.

//	String str1 ="Hello";
//	String str2 ="Hi";
//	@Test
//	public void sample() {
//	Assert.assertEquals(str1, "str2");   // ouutput==> Fail
//	}
	
	//2. assertNotEquals():- It is used to verify expected and actual results, If both results are not same then output is pass otherwise fail.

//	String str1 ="Hello";
//	String str2 ="Hi";
//	@Test
//	public void sample() {
//	Assert.assertNotEquals(str1, str2);  // Pass
//	}
	
	//3. assertTrue():- This method is used to verify conditions are true or false.If condition is true then output is pass otherwise fail.
//	@Test
//	public void sample() {
//		Assert.assertTrue(rv.isSelected());  
//		Assert.assertTrue(rv.isDisplayed());  
//		Assert.assertTrue(rv.isEnabled());  
//	}

}
