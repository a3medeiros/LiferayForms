package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LiferayFormPage extends BasePage {
	
	//constructor
	public LiferayFormPage(WebDriver driver) {
		super(driver);
		WebDriverWait wait = new WebDriverWait (driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
	}

	//declaring elements that are going to be used
	WebElement nameField = driver.findElement(By.xpath("//div/input[contains(@id,'Qual…SeuNome')]"));
	WebElement dateField = driver.findElement(By.xpath("//div/input[@class='form-control'][contains(@aria-label,'Qual È a data do seu nascimento?')]"));
	WebElement whyField = driver.findElement(By.xpath("//div/textarea[contains(@name,'PorqueVocÍIngressouNa¡reaDeTestes')]"));
	WebElement submitBtn = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
	
	//write on name field
	public LiferayFormPage writeOnNameField(String name) {
		nameField.sendKeys(name);
		return this;
	}	
	
	//write on date field	
	public LiferayFormPage writeOnDateField(String date) {
		dateField.sendKeys(date);
		return this;
	}
	
	//write on why field
	public LiferayFormPage writeOnWhyField(String why) {
		whyField.sendKeys(why);	
		return this;
	}
	
	//fill all the form with the methods above
	public LiferayFormPage fillForm(String name, String date, String why) {
		writeOnNameField(name);
		writeOnDateField(date);
		writeOnWhyField(why);
		return this;
	}
	
	//click on submit button after form is filled
	public SuccessLiferayFormPage submitForm() {
		submitBtn.sendKeys(Keys.ENTER);
		return new SuccessLiferayFormPage(driver);
		}
	
	//click on submit button when form isn't filled
	public LiferayFormPage justSubmitForm() {
		submitBtn.sendKeys(Keys.ENTER);	
		return this;
		}
	
	//list of the quantity of required fields that will appear after clicking on submit to check with the number of required fields
	public int requiredFieldsNotFilledSize() {
		List<WebElement> requiredFieldList = driver.findElements(By.xpath("//div[contains(text(),'This field is required.')]"));
		return requiredFieldList.size();
	}
	
	//search on page for the party rock text
	public boolean searchPartyRock(String txt) {
		return driver.getPageSource().contains(txt);
}

	
}


