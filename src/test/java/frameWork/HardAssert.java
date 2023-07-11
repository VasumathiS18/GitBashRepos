package frameWork;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert {
@Test
public void createCustomer()
{
	System.out.println("step1");
	System.out.println("step2");
	//Assert.assertEquals(true, true);
	Assert.assertEquals(false,true);
	System.out.println("step3");
	System.out.println("step4");
}
@Test
public void m1()
{
	String expName="vasu";
	String actName="vasu";//vasumathi
	Assert.assertEquals(expName,actName);
}
}
