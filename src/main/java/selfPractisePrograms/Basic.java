package selfPractisePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\vasu\\Eclipse Software\\workspace\\MavenProjects\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
WebDriver driver= new ChromeDriver(co);
driver.get("https://www.google.com");
driver.manage().window().maximize();

	}

}


/*
 * ChromeOptions co= new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);*/
 