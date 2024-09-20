package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	private WebDriver driver;
	 
	public BaseClass(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void quitBrowser() {

		driver.close();
		driver.quit();
		//driver.close();
	}


}
