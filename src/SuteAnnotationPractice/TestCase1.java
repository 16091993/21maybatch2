package SuteAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeSuite
	public void emailconfigaration() {
		System.out.println("Email is configered");
	}
	@AfterSuite
	public void sentemail() {
		System.out.println("Email is sent After configered");
	}
	
	@BeforeTest
	public void openDB() {
		System.out.println("DataBase is open");
	}
	@AfterTest
	public void closeDB() {
		System.out.println("DataBase is closed");
	}
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	@Test
	public void m1() {
		System.out.println("Method m1");
	}
	@Test
	public void m2() {
		System.out.println("Method m2");
	}
	@Test
	public void m3() {
		System.out.println("Method m3");
	}
	

}
