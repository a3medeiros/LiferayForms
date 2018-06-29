package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//2.0
public class LiferayFormPage extends BasePage {

	public LiferayFormPage(WebDriver driver) {
		super(driver);
		WebDriverWait wait = new WebDriverWait (driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
	}



	
	WebElement nameField = driver.findElement(By.xpath("//div/input[contains(@id,'Qual…SeuNome')]"));
	WebElement dateField = driver.findElement(By.xpath("//div/input[@class='form-control'][contains(@aria-label,'Qual È a data do seu nascimento?')]"));
	WebElement whyField = driver.findElement(By.xpath("//div/textarea[contains(@name,'PorqueVocÍIngressouNa¡reaDeTestes')]"));
	WebElement submitBtn = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
	
	
	public LiferayFormPage writeOnNameField(String name) {
		nameField.sendKeys(name);
		return this;
	}	
		
	public LiferayFormPage writeOnDateField(String date) {
		dateField.sendKeys(date);
		return this;
	}
		
	public LiferayFormPage writeOnWhyField(String why) {
		whyField.sendKeys(why);	
		return this;
	}
	
	public LiferayFormPage fillForm(String name, String date, String why) {
		writeOnNameField(name);
		writeOnDateField(date);
		writeOnWhyField(why);
		return this;
	}
	
	public SuccessLiferayFormPage submitForm() {
		submitBtn.sendKeys(Keys.ENTER);
		return new SuccessLiferayFormPage(driver);
		}
	
	public LiferayFormPage justSubmitForm() {
		submitBtn.sendKeys(Keys.ENTER);	
		return this;
		}
	
	public int requiredFieldsNotFilledSize() {
		List<WebElement> requiredFieldList = driver.findElements(By.xpath("//div[contains(text(),'This field is required.')]"));
		return requiredFieldList.size();
	}
	
	public boolean searchPartyRock(String txt) {
		System.out.println(driver);
		return driver.getPageSource().contains(txt);
}

	
}


