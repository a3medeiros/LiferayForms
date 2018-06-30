package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.0
public class Web {
	
	public static WebDriver driver;
	
	//method that starts a Chrome
	public static WebDriver createChrome() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.LIFERAY_FORM_URL);
	
		return driver;
		
	}	
}
