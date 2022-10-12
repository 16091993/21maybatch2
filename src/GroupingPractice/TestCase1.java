package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest(alwaysRun = true)
	public void OpenDB() {
		System.out.println("DataBase is open");
	}
	@AfterTest(alwaysRun = true)
	public void ClosedDB() {
		System.out.println("Database is close");
	}
	@BeforeClass(alwaysRun = true)
	public void OpenBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass(alwaysRun = true)
	public void ClosedBrowser() {
		System.out.println("Browser is closed");
	}
	@Test(groups = "Smoke")
	public void test1() {
		System.out.println("Excicuting test1");
	}
	@Test(groups = "Functional")
	public void test2() {
		System.out.println("Excicuting test2");
	}
	@Test(groups = {"Functional","Regresion"})
	public void test3() {
		System.out.println("Excicuting test3");
	}

}
