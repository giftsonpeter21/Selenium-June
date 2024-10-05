package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
 
	@BeforeTest
	public void setup()
	{
		System.out.println("before test");
	}
	@BeforeMethod
	public void urlloading() 
	{
		System.out.println("before method");
	}
	@Test(priority=4, invocationCount =2,groups= {"smoke"} )
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test(priority=3,dependsOnMethods= {"test1"},groups= {"smoke,regression"})
	public void test2()
	{
		System.out.println("Test 2");
	}
	@Test(priority=2,enabled=false) 
	public void test3()
	{
		System.out.println("Test 3");
	}
	@Test(priority=1,groups= {"smoke"}) 
	public void test4()
	{
		System.out.println("Test 4");
	}
	@Test(groups= {"smoke"})
	public void test5()
	{
		System.out.println("Test 5");
	}
	@AfterMethod
	public void  aftrmeth()
	{
		System.out.println("After method");
	}
	@AfterTest
	public void close()
	{
		System.out.println("After Test");
	}
	
	
}
