package VeryficationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void test1() {
		String str1 = "Hello";
		Assert.assertEquals(str1, "Hi");  //Fail
		System.out.println(str1);
		
		String str2 = "Hi";
		Assert.assertEquals(str2, "Hi");
		System.out.println(str2);
	}

}
