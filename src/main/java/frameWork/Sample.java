package frameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

@Test
public void createContact()
{
	int []arr= {1,2,3};
	//System.out.println(arr[5]);
	System.out.println(arr[2]);
	System.out.println("contact created");
	// to fail this method
	//	Assert.fail();
}

@Test(dependsOnMethods = "createContact")
public void modifyContact()
{
	System.out.println("Contact Modified");
	// modify will fail because of createContact() has assert.fail(); 
}

/*
 * // this method wont execute because of assert fail
 * 
 * @Test(dependsOnMethods = "createContact") public void deleteContact() {
 * System.out.println("Contact deleted"); }
 */


//to make the method to execute eventhough assert is fail use alwaysRun =true
@Test(dependsOnMethods = "createContact",alwaysRun = true)
public void deleteContact()
{
	System.out.println("Contact deleted");
}
	
}





