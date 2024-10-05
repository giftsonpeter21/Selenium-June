package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGdemo2 {
    
	@Parameters("v")
	@Test
	public void test1(String v)
	{
		System.out.println("v= "+v);
	}
}
