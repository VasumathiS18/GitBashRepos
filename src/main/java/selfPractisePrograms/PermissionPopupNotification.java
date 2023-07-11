package selfPractisePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopupNotification {

	public static void main(String[] args) {
//Like if we open a browser notification allow or block popup will appear 
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");

	}

}
