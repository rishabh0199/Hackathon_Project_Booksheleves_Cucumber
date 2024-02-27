package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.GiftsCardHomePage;
import testBase.BaseClass;
/***********************************************************************************
*                                                                                  *
* Class Name     : TC_0004_GiftCards                                               * 
* Description    : Get the Gift Card option and fill the Form of gift Card.        *
*                                                                                  *
************************************************************************************/
public class TC_0004_GiftCards extends BaseClass{
	
	GiftsCardHomePage gcp;
	JavascriptExecutor js ;
	
	@Test(priority = 20,groups = { "Smoke Test two" })
	public void scrollPage() throws InterruptedException
	{
		BaseClass.getLogger().info("**********Starting TC_0004_GiftCards************");
		BaseClass.getLogger().info("**********Scrolling Page Up Gift Cards button***********");
		
		gcp =new GiftsCardHomePage(driver);
		gcp.scrollpage();
		
		BaseClass.getLogger().info("**********scrollPage() successfully passed***********");
	}
	
	@Test(priority = 21,groups = { "Smoke Test two" })
	public void clickGiftCardsButton()
	{
		BaseClass.getLogger().info("**********Clicking the Gift Cards Button***********");
		
		gcp.clickGiftCards();

		BaseClass.getLogger().info("**********clickGiftCardsButton() successfully passed***********");
	}
	
	@Test(priority = 22,groups = { "Smoke Test two" })
	public void loadTheJSONFile()
	{
		BaseClass.getLogger().info("**********loading JSON file***********");
		
		gcp.testCaseReadJSON();
		
		BaseClass.getLogger().info("**********loadTheJSONFile() successfully passed***********");
	}

	
	@Test(priority = 23,groups = { "Smoke Test two" })
	public void scrollDownToGiftsOptions()
	{
		BaseClass.getLogger().info("**********Scrolling to all gift options present***********");
		
		gcp.scrollDownToGifts();
		
		BaseClass.getLogger().info("**********scrollDownToGiftsOptions() successfully passed***********");
	}
	
	@Test(priority = 24,groups = { "Smoke Test two" })
	public void selectBirthdayOrAnniversary() 
	{
		BaseClass.getLogger().info("**********Selcting Birthday And Anniversary card***********");
		
		gcp.clickOnBirthdayOrAnniversary();
		
		BaseClass.getLogger().info("**********selectBirthdayOrAnniversary() successfully passed***********");
	}
	
	@Test(priority = 25,groups = { "Smoke Test two" })
	public  void enteringPriceAmount() 
	{
		BaseClass.getLogger().info("**********Entring Price for Card***********");
		
		gcp.enteringAmount();
		
		BaseClass.getLogger().info("**********enteringPriceAmount() successfully passed***********");
	}
	
	@Test(priority = 26,groups = { "Smoke Test two" })
	public  void clickOnNextbtn() 
	{
		BaseClass.getLogger().info("**********Clicking on next Button***********");
		
		gcp.clickOnNext();
		
		BaseClass.getLogger().info("**********clickOnNextbtn() successfully passed***********");
	}
	
	@Test(priority = 27,groups = { "Smoke Test two" })
	public  void enterNameofRecipient() 
	{
		BaseClass.getLogger().info("**********Entring Recipient name***********");
		
		gcp.enterRecipientName();
		
		BaseClass.getLogger().info("**********lenterNameofRecipient() successfully passed***********");
	}
	
	@Test(priority = 28,groups = { "Smoke Test two" })
	public void enterEmailofRecipient() 
	{
		BaseClass.getLogger().info("**********Entering the invalid recipient email***********");
		
		gcp.enterRecipientEmail();
		
		BaseClass.getLogger().info("**********EnterEmailofRecipient() successfully passed***********");
	}
	@Test(priority = 29,groups = { "Smoke Test two" })
	public void enterMobileofRecipient() 
	{
		BaseClass.getLogger().info("**********Entring Recipient Mobile number***********");
		
		gcp.enterRecipientMobile();
		
		BaseClass.getLogger().info("*********enterMobileofRecipient() successfully passed***********");
	}
	
	
	@Test(priority = 30,groups = { "Smoke Test two" })
	public void enterNameofCustomer() 
	{
		BaseClass.getLogger().info("**********Entering Name of Customer***********");
		
		gcp.enterCustomerName();
		
		BaseClass.getLogger().info("*********enterNameofCustomer() successfully passed***********");
	}
	
	@Test(priority = 31,groups = { "Smoke Test two" })
	public void enterEmailofCustomer() 
	{
		BaseClass.getLogger().info("**********Entring Email of Customer***********");
		
		gcp.enterCustomerEmail() ;
		
		BaseClass.getLogger().info("**********enterEmailofCustomer() successfully passed***********");
	}
	
	@Test(priority = 32,groups = { "Smoke Test two" })
	public void enterMobileNumberofCustomer() 
	{
		BaseClass.getLogger().info("**********Entering Mobile number of Customer***********");
		
		gcp.enterCustomerMobileNumber();
		
		BaseClass.getLogger().info("**********enterMobileNumberofCustomer() successfully passed***********");
		
	}
	@Test(priority = 33,groups = { "Smoke Test two" })
	public void enterAddressofCustomer() 
	{
		BaseClass.getLogger().info("**********Entering Address of Customer***********");
		
		gcp.enterCustomerAddress();
		
		BaseClass.getLogger().info("**********enterAddressofCustomer() successfully passed***********");
		
	}
	
	@Test(priority = 34,groups = { "Smoke Test two" })
	public void enterPinofCustomerPin()
	{
		BaseClass.getLogger().info("**********Entering Pin code of Customer***********");
		
		gcp.enterCustomerPin();
		
		BaseClass.getLogger().info("**********enterPinofCustomerPin() successfully passed***********");
	}
	
	@Test(priority = 35,groups = { "Smoke Test two" })
	public void enterMessageIfAny() 
	{
		BaseClass.getLogger().info("**********Entering Message ***********");
		
		gcp.enterMessage();
		
		BaseClass.getLogger().info("**********enterMessageIfAny() successfully passed***********");
		
	}
	
	@Test(priority = 36,groups = { "Smoke Test two" })
	public void clickOnConfirmbtn() throws InterruptedException 
	{
		BaseClass.getLogger().info("**********Clicking confirm button***********");
	
		gcp.clickOnConfirm();
		
		BaseClass.getLogger().info("**********clickOnConfirmbtn() successfully passed***********");
		
	}

	@Test(priority = 37,groups = { "Smoke Test two" })
	public void getErrorMessage()
	{
		BaseClass.getLogger().info("**********Capturing Error Message***********");
		
		gcp.displayErrorMessage();
		
		BaseClass.getLogger().info("**********getErrorMessage() successfully passed***********");
	}
	
	@Test(priority = 38,groups = { "Smoke Test two" })
	public void clearrecipientmail()
	{
		BaseClass.getLogger().info("**********Clearing the email input box for recipient***********");
		
		gcp.clearRecipientEmailBox();
		
		BaseClass.getLogger().info("**********clearrecipientmail() successfully passed***********");
	}
	
	@Test(priority = 39,groups = { "Smoke Test two" })
	public void enterCorrectDeatils()
	{
		BaseClass.getLogger().info("**********Entering correct mail for recipient***********");
		
		gcp.enterCorrectrecipientEmail();
		
		BaseClass.getLogger().info("**********enterCorrectDeatils() successfully passed***********");
	}
	@Test(priority = 40,groups = { "Smoke Test two" })
	public void clickConfirmWithcorrectEmail() throws InterruptedException
	{
		BaseClass.getLogger().info("**********clicking on confirm button***********");
		
		gcp.clickConfirmafterCorrectEmail();
		
		BaseClass.getLogger().info("**********clickConfirmWithcorrectEmail() successfully passed***********");
	}
	
	@Test(priority = 41,groups = { "Smoke Test two" })
	public void confirmDetails()//if always pass testNG test either fails or pass
	{
		
		BaseClass.getLogger().info("**********Verfiying form submitted successfully***********");
		
		WebElement elem = gcp.confirmationDetailsDisplay();
		boolean b= elem.isDisplayed();//if confirm page heading diplayed after submission success
		if(b)
		{
			System.out.println("Successfully submitted Details and now on verify Details Page:");
		}
		else
		{
			System.out.println("Failed to submit Details and not on verify Details Page:");
		}
		BaseClass.getLogger().info("**********confirmDetails() successfully passed***********");
	}
	
}

