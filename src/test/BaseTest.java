package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import support.Web;
//2.0
public class BaseTest {
	
	private WebDriver driver;
 	
	@Before
	public void setUp() {
		driver = Web.createChrome();
	}
	
	@After
	  public void tearDown(){
  //Fechar o navegador
	//driver.quit();
	}
}
