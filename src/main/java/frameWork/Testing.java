package frameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 
		
		System.setProperty("webdriver.chrome.driver","C:\\vasu\\Eclipse Software\\workspace\\MavenProjects\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.google.com");
		List<WebElement> objLink = driver.findElements(By.tagName("a"));
		
		System.out.println("number of link in the page  :"+objLink.size());
		int i=1;
		for (WebElement links : objLink) {
			System.out.println("Link "+i+":  "+links.getText());
			i++;
		}
		
		driver.manage().window().maximize();
		driver.quit();
	}

	private static void foreach() {
		// TODO Auto-generated method stub
		
	}

}
