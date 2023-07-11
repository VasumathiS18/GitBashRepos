package frameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopup {

	WebDriver driver;
	@BeforeClass
	public void setDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void cal() {
		// TODO Auto-generated method stub
		

driver.get("https://www.makemytrip.com/");
		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//span[text()='Departure']")).click();
		  driver.findElement(By.xpath("//div[text()='March 2023']"
		  +"/ancestor::div[@class=\'DayPicker-Month']" + "/decendant:p[text()='22']"));
		 
	}

}
