package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import support.Constants;


//Form Page of the Success Page after fill the form and submit it
public class SuccessLiferayFormPage extends BasePage {

//constructor
public SuccessLiferayFormPage(WebDriver driver) {
		super(driver);
	}

	//method to check if a message appear on the page
	public boolean containsSuccessMsg(String txt) {
	
		WebDriverWait wait = new WebDriverWait (driver, 90);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div/h1"), Constants.SUCCESS_TITLE));
		
		return driver.getPageSource().contains(txt);
	}
}

