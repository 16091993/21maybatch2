package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TastCase3 {
	
	@BeforeClass(alwaysRun = true)
	public void OpenBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass(alwaysRun = true)
	public void ClosedBrowser() {
		System.out.println("Browser is closed");
	}
	@Test(groups = "Smoke")
	public void test7() {
		System.out.println("Excicuting test7");
	}
	@Test(groups = "Functional")
	public void test8() {
		System.out.println("Excicuting test8");
	}
	@Test(groups = {"Functional","Regresion"})
	public void test9() {
		System.out.println("Excicuting test9");
	}

}
