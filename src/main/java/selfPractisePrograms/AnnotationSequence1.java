package selfPractisePrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
// supporting Annotation program
public class AnnotationSequence1 {
	//refer AnnotationSequence1,AnnotationSeq2.java,testing.xml
	@BeforeTest
	void beforeTest()
	{
		System.out.println("This will execute before every Test");	
	}
	
	@AfterTest
	void afterTest()
	{
		System.out.println("This will execute after every Test");	
	}

	@BeforeClass
	void beforeClass()
	{
		System.out.println("This will execute before every class");	
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("This will execute before every class");	
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
	void test1()
	{
		System.out.println("This is test1");
	}
	
	
	@Test
	void test2()
	{
		System.out.println("This is test2");
	}
}
