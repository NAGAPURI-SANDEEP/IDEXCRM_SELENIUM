package UTILS;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	
	@Test
	public  static void TestTitle() {
		
		String exp_title="Sandeep";
		String Act_title="Sandeep";
		
		Assert.assertEquals(exp_title, Act_title);
		
		//Assert.assertEquals("123", 123);
		//Assert.assertEquals(123, 123);
		//Assert.assertEquals("xyz","xyz");
		
		//Assert.assertNotEquals(1233, 123);
		//Assert.assertNotEquals(123, 123);
		
		
		//Assert.assertTrue(1==2);
//		Assert.assertTrue(2==2);
//		
//		
//		
//		
//		
//		
//		
//		
//	Assert.assertFalse(3==3);
	
	
	
	
		
		
		
	}
	
	
	@Test
	public static void softassert() {
		
		System.out.println("this is for testing the softassert");
		
		System.out.println("this is hard assert");
		
		
		
		SoftAssert SA  = new SoftAssert();
		SA.assertEquals(123123,123);
		
		System.out.println("softassert testing ");
		
		SA.assertAll();

	}

}
