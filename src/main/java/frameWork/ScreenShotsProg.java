package frameWork;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
public class ScreenShotsProg {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\vasu\\Eclipse Software\\workspace\\MavenProjects\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
TakesScreenshot screen=(TakesScreenshot)driver;
File src =screen.getScreenshotAs(OutputType.FILE); 
 File dest = new File("Failed1.png");
 FileUtils.copyFile(src, dest); driver.quit();

	}

}
/*
 * System.setProperty("webdriver.gecko.driver",
 * "C:\\vasu\\Eclipse Software\\workspace\\MavenProjects\\src\\main\\resources\\geckodriver.exe"
 * ); FirefoxOptions options = new FirefoxOptions();
 * options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
 * WebDriver driver = new FirefoxDriver(options);
 * driver.get("https://demo.actitime.com/login.do");
 * 
 * TakesScreenshot screen = (TakesScreenshot) driver; 
 * File src =screen.getScreenshotAs(OutputType.FILE); 
 * File dest = new File("Failed.png");
 * FileUtils.copyFile(src, dest); driver.quit();
 */