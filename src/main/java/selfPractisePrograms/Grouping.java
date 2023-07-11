package selfPractisePrograms;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = {"sanity"})
	void test1()
	{
		System.out.println("This is test1 ");
	}
	
	@Test(groups = {"regression"})
	void test2()
	{
		System.out.println("This is test2 ");
	}
	@Test(groups = { "sanity"})
	void test3()
	{
		System.out.println("This is test3 ");
	}
	@Test(groups = {"regression"})
	void test4()
	{
		System.out.println("This is test4 ");
	}
	@Test(groups = {"sanity"})
	void test5()
	{
		System.out.println("This is test5 ");
	}
	
	
	
	
}
