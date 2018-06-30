package test;


import org.junit.Assert;
import org.junit.Test;


import pageObjects.LiferayFormPage;
import pageObjects.SuccessLiferayFormPage;
import support.Constants;
import support.Web;

//class that contains the testcases to be performed
public class LiferayFormTests extends BaseTest {
		
	@Test
	public void searchPartyRockOnPage(){
		LiferayFormPage formPage = new LiferayFormPage(Web.driver);
		Assert.assertEquals(true, formPage.searchPartyRock("party rock"));
	}
	
	@Test
	public void submitFormWithSuccess() throws InterruptedException {
		
		LiferayFormPage formPage = new LiferayFormPage(Web.driver);	
		formPage.fillForm(Constants.MAIN_NAME, Constants.MAIN_DATE, Constants.WHY);
		Thread.sleep(2000);
		formPage.submitForm();		
		SuccessLiferayFormPage successPage = new SuccessLiferayFormPage(Web.driver);
		Assert.assertEquals(true, successPage.containsSuccessMsg(Constants.SUCCESS_MSG));
		
	}
	
	@Test
	public void checkRequiredFields() throws InterruptedException {
		LiferayFormPage formPage = new LiferayFormPage(Web.driver);
		formPage.justSubmitForm();
		Thread.sleep(2000);
		Assert.assertEquals(Constants.NUMBER_OF_FIELDS, formPage.requiredFieldsNotFilledSize());
	}
}
