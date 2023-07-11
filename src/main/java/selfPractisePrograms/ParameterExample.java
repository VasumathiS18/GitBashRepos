package selfPractisePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
//passing the parameter from xml file
	
		@Test
		void display()
		{
		System.out.println("this is parameter test");	
		}
		WebDriver driver;
		@BeforeClass
		@Parameters({"browser","url"})
		void setup(String browser,String app)
		{
			
			if(browser.equalsIgnoreCase("firefox"))
			{
				String key="webdriver.firefox.driver"; 
				  String value="C:\\Users\\madha\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe";
				  System.setProperty(key,value);
				  driver.get(app);
			}
			
		}
		
		
	}


