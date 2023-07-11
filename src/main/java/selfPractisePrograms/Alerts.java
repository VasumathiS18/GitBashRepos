package selfPractisePrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
WebDriver driver=new FirefoxDriver();

driver.get("https://the-internet.herokuapp.com/javascript_alerts");
/*// for ok button
 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
 * ; Thread.sleep(2000); driver.switchTo().alert().accept();
 */
/*
 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
 * (); Thread.sleep(2000); //driver.switchTo().alert().accept();//--->for OK
 * button driver.switchTo().alert().dismiss();// --->for cancel button
 */

// for alert window input box, capture text from alert popup
driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
Alert alertwindow=driver.switchTo().alert();
System.out.println("The message displayed is "+alertwindow);

alertwindow.sendKeys("welcome");
alertwindow.accept();
	}

}
