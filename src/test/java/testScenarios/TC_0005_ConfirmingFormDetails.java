package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.SubmittedFormDetailsPage;
import testBase.BaseClass;
import utilities.JsonRead;
/***********************************************************************************
*                                                                                  *
* Class Name     : HomePageByAtHome                                                * 
* Description    : To Get all the web elements present in the website              *
* 				   and to return the same.                                         *
*                                                                                  *
************************************************************************************/
public class TC_0005_ConfirmingFormDetails extends BaseClass{

	SubmittedFormDetailsPage fdp;
	SoftAssert softAssert;

	@Test(priority = 42,groups = { "Regression Test two" })
	public void confirmamountEnetered()
	{
		fdp=new SubmittedFormDetailsPage(driver);
		WebElement elem = fdp.amountEnetered();
		String elementText = elem.getText();
		
		String[] parts = elementText .split(",");
		String part1 = parts[0]; 
		String part2= parts[1];
		String concatenatedText = part1 + part2;
		String numericValue = concatenatedText.replaceAll("[^0-9]", "");//replace rupee sign
		System.out.println(numericValue);
		
		if(numericValue.equalsIgnoreCase(JsonRead.amount))
				{
					System.out.println("amount matched:"+numericValue);
				}
		else
		{
			System.out.println("amount not matching with confirmation page");
		}
	}
	
	
	
	@Test(priority = 43,groups = { "Regression Test two" })//hard assertion if fails terminate all further test cases//Assert.assertEquals(p, JsonRead.recipientName, "RecipientName mismatch");
	public void confirmrecipientName()
	{
		softAssert = new SoftAssert();
		WebElement elem = fdp.recipientName();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.recipientName, "RecipientName mismatch");
		softAssert.assertAll();
		
	}
	@Test(priority = 44,groups = { "Regression Test two" })
	public void confirmrecipientEmail()//soft assertion if fails run all further test cases
	{
		
		WebElement elem = fdp.recipientEmail();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.correctemail, "recipientEmail mismatch");
		softAssert.assertAll();
	}
	@Test(priority = 45,groups = { "Regression Test two" })
	public void confirmrecipientMobile()
	{
		WebElement elem = fdp.recipientMobile();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.recipientmobile, "recipientMobile mismatch");
		softAssert.assertAll();
	}
	@Test(priority = 46,groups = { "Regression Test two" })
	public void confirmcustomerName()
	{
		WebElement elem = fdp.customerName();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerName, "customerName mismatch ");
		softAssert.assertAll();
	}
	@Test(priority = 47,groups = { "Regression Test two" })
	public void confirmcustomerEmail()
	{
		WebElement elem = fdp.customerEmail();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerEmail, "customerEmail mismatch ");
		softAssert.assertAll();
	}
	@Test(priority = 48,groups = { "Regression Test two" })
	public void confirmcustomerMobile()
	{
		WebElement elem = fdp.customerMobile();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerMobile, "customerMobile mismatch ");
		softAssert.assertAll();
	}
	@Test(priority = 49,groups = { "Regression Test two" })
	public void confirmcustomerCity()
	{
		WebElement elem = fdp.customerCity();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerAddress, "customerCity mismatch ");
		softAssert.assertAll();
	}
	@Test(priority = 50,groups = { "Regression Test two" })
	public void confirmcustomerPinCode()
	{
		WebElement elem = fdp.customerPinCode();
		//System.out.println(elem.getText());//gives both parts zip with city
		String elementText = elem.getText();
		String[] parts = elementText .split(",");
		String part1 = parts[0]; // "110059"//only zip
		System.out.println(part1);
		softAssert.assertEquals(part1, JsonRead.customerPin, "customerPinCode mismatch ");
		softAssert.assertAll();
		
	}

		
}
