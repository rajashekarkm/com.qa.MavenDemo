package practiceMaven;

import org.testng.annotations.Test;

public class EnableDisableTest {

	
	@Test(enabled=true)
	public void EnabledMethod()
	{
		System.out.println("Enabled Method");
	}
	
	//even if specify alwaysRun=turn still it is Disabled Method
	@Test(enabled=false,alwaysRun=true)
	public void disabledMethod()
	{
		System.out.println("Disabled Method");
	}
}
