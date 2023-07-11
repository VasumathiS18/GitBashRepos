package selfPractisePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest1 {
WebDriver driver;
@Test
void logoTest() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "C:/Users/madha/Downloads/geckodriver-v0.32.2-win3/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://opensource-demo.organgehrmlive.com");
}

@Test
void homePageTitle()
{
	
}

}
