package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@BeforeClass(alwaysRun = true)
	public void OpenBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass(alwaysRun = true)
	public void ClosedBrowser() {
		System.out.println("Browser is closed");
	}
	@Test(groups = "Smoke")
	public void test4() {
		System.out.println("Excicuting test4");
	}
	@Test(groups = "Functional")
	public void test5() {
		System.out.println("Excicuting test5");
	}
	@Test(groups = {"Functional","Regresion"})
	public void test6() {
		System.out.println("Excicuting test6");
	}

}
