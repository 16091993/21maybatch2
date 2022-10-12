package VeryficationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample1 {
	
	@Test
	public void test1() {
		SoftAssert soft = new SoftAssert();
		String str1 = "Hello";
		soft.assertEquals(str1, "Hi");  //Fail
		System.out.println(str1);
		
		String str2 = "Hi";
		soft.assertEquals(str1, "Hi");
		System.out.println(str2);
		soft.assertAll();
	}

}
