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
		gcp =new GiftsCardHomePage(driver);
		gcp.scrollpage();
	}
	
	@Test(priority = 21,groups = { "Smoke Test two" })
	public void clickGiftCardsButton()
	{
		gcp.clickGiftCards();
	}
	
	@Test(priority = 22,groups = { "Smoke Test two" })
	public void loadTheJSONFile()
	{
		
		gcp.testCaseReadJSON();
	}

	
	@Test(priority = 23,groups = { "Smoke Test two" })
	public void scrollDownToGiftsOptions()
	{
		
		gcp.scrollDownToGifts();
	}
	
	@Test(priority = 24,groups = { "Smoke Test two" })
	public void selectBirthdayOrAnniversary() 
	{
		gcp.clickOnBirthdayOrAnniversary();
	}
	
	@Test(priority = 25,groups = { "Smoke Test two" })
	public  void enteringPriceAmount() 
	{
		
		gcp.enteringAmount();
		
	}
	
	@Test(priority = 26,groups = { "Smoke Test two" })
	public  void clickOnNextbtn() 
	{
		
		gcp.clickOnNext();
		
	}
	
	@Test(priority = 27,groups = { "Smoke Test two" })
	public  void enterNameofRecipient() 
	{
		
		gcp.enterRecipientName();
		
	}
	
	@Test(priority = 28,groups = { "Smoke Test two" })
	public void enterEmailofRecipient() 
	{
		
		gcp.enterRecipientEmail();
		
	}
	@Test(priority = 29,groups = { "Smoke Test two" })
	public void enterMobileofRecipient() 
	{
		
		gcp.enterRecipientMobile();
		
	}
	
	
	@Test(priority = 30,groups = { "Smoke Test two" })
	public void enterNameofCustomer() 
	{
		
		gcp.enterCustomerName();
		
	}
	
	@Test(priority = 31,groups = { "Smoke Test two" })
	public void enterEmailofCustomer() 
	{
		
		gcp.enterCustomerEmail() ;
	}
	
	@Test(priority = 32,groups = { "Smoke Test two" })
	public void enterMobileNumberofCustomer() 
	{
		
		gcp.enterCustomerMobileNumber();
		
	}
	@Test(priority = 33,groups = { "Smoke Test two" })
	public void enterAddressofCustomer() 
	{
		
		gcp.enterCustomerAddress();
		
	}
	
	@Test(priority = 34,groups = { "Smoke Test two" })
	public void enterPinofCustomerPin()
	{
		gcp.enterCustomerPin();
	}
	
	@Test(priority = 35,groups = { "Smoke Test two" })
	public void enterMessageIfAny() 
	{
		
		gcp.enterMessage();
		
	}
	
	@Test(priority = 36,groups = { "Smoke Test two" })
	public void clickOnConfirmbtn() throws InterruptedException 
	{
	
		gcp.clickOnConfirm();
		
	}

	@Test(priority = 37,groups = { "Smoke Test two" })
	public void getErrorMessage()
	{
		gcp.displayErrorMessage();
	}
	
	@Test(priority = 38,groups = { "Smoke Test two" })
	public void clearrecipientmail()
	{
		gcp.clearRecipientEmailBox();
	}
	
	@Test(priority = 39,groups = { "Smoke Test two" })
	public void enterCorrectDeatils()
	{
		gcp.enterCorrectrecipientEmail();
	}
	@Test(priority = 40,groups = { "Smoke Test two" })
	public void clickConfirmWithcorrectEmail() throws InterruptedException
	{
		gcp.clickConfirmafterCorrectEmail();
	}
	
	@Test(priority = 41,groups = { "Smoke Test two" })
	public void confirmDetails()//if always pass testNG test either fails or pass
	{
		
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
	}
}

