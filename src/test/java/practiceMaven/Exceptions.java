package practiceMaven;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Exceptions {

	@Test(expectedExceptions=ArithmeticException.class)
	public void arithmeticError()
	{
		int i=10;
		System.out.println(i/0);
	}
	
	@Test(expectedExceptions=SkipException.class)
	public void skipMethod()
	{
		throw new SkipException("SkipException to Skip the method");
	}
	
	@Test()
	public void arithmeticNoError()
	{
		int i=10;
		System.out.println(i/5);
	}
	
	@Test(groups="sanity")
	public void sanityTest()
	{
		System.out.println("Sanity Test in Exception");
	}
	
	
	
	
	
}
