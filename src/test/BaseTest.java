package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import support.Web;
//2.0
public class BaseTest {
	
	private WebDriver driver;
 	
	//initialize the chromedriver
	@Before
	public void setUp() {
		
		driver = Web.createChrome();
	}
	
	//close window
	@After
	  public void tearDown(){
  
	driver.quit();
	}
}
