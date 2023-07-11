package selfPractisePrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//supporting annotation programs
public class AnnotationSeq2 {
	//refer AnnotationSequence1,AnnotationSeq2.java,testing.xml
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("This will execute before every suite");	
	}
	
	@AfterSuite
	void afterSuite()
	{
		System.out.println("This will execute after every suite");	
	}

	@BeforeMethod
	void beforeMethod()
	{
	System.out.println("This will execute before every method");	
	}
	@AfterMethod
	void afterMethod()
	{
		System.out.println("This will execute after every method");
	}
	@Test
	void test3()
	{
		System.out.println("This is test3");
	}
	
	
	@Test
	void test4()
	{
		System.out.println("This is test4");
	}
}
