package frameWork;

import org.testng.annotations.Test;

public class PrioritiesPrg {
	
	
	@Test(priority = 1)
	public void createContact()
	{
		System.out.println("contact created");
	}

	//@Test(priority=2)
		public void modifyContact()
	{
		System.out.println("Contact Modified");
	}

		
		//@Test(invocationCount = 3)//->will execute 3 times
		//by default for a method enabled is true only
		//-> to disable this method execution.
	@Test(priority=3,enabled = false) 
	public void deleteContact()
	{
		System.out.println("Contact deleted");
	}
	 
	 
}


/*//@Test(priority = 1)
	//@Test(priority = 1)
	@Test
	public void createContact()
	{
		System.out.println("contact created");
	}

	//@Test(priority=2)
	//@Test(priority = -1)
	@Test
	public void modifyContact()
	{
		System.out.println("Contact Modified");
	}

	//@Test(priority=3)
	//@Test(priority = 0)
	@Test(invocationCount = 3)
	public void deleteContact()
	{
		System.out.println("Contact deleted");
	}
 */