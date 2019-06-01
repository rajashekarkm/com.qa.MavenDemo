package practiceMaven;


import org.testng.annotations.Test;

public class PriorityTest {

	
	@Test(priority=1)
	public void setup()
	{
		System.out.println("priority 1");
	}
	
	@Test(priority=-1)
	public void openBrowser()
	{
		System.out.println("priority -1");
	}
	
	@Test(priority=2)
	public void search()
	{
		System.out.println("priority 2 ");
	}
	
	@Test(priority=2)
	public void asearch1()
	{
		System.out.println("priority 2 duplicate ");
	}
	
	@Test
	public void advanceSearch()
	{
		System.out.println("No priority");
	}
	
	
}
