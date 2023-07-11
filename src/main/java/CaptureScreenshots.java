import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\vasu\\Eclipse Software\\workspace\\MavenProjects\\src\\main\\resources\\chromedriver.exe");
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);
driver.get("https://www.google.com");
driver.manage().window().maximize();


  TakesScreenshot ts=(TakesScreenshot)driver; 
  File src=ts.getScreenshotAs(OutputType.FILE);
  File trg=new File("screenshot.png");
  FileUtils.copyFile(src, trg);
 
driver.close();

	}

}
