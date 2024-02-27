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
* Class Name     : TC_0005_ConfirmingFormDetails                                   * 
* Description    : Validate the submitted form details.                            *
*                                                                                  *
************************************************************************************/
public class TC_0005_ConfirmingFormDetails extends BaseClass{

	SubmittedFormDetailsPage fdp;
	SoftAssert softAssert;

	@Test(priority = 42,groups = { "Regression Test two" })
	public void confirmamountEnetered()
	{
		BaseClass.getLogger().info("**********Starting TC_0005_ConfirmingFormDetails ************");
		BaseClass.getLogger().info("**********Verifying the Entered Amount***********");
		
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
		
		BaseClass.getLogger().info("**********confirmamountEnetered() successfully passed***********");
	}
	
	
	
	@Test(priority = 43,groups = { "Regression Test two" })//hard assertion if fails terminate all further test cases//Assert.assertEquals(p, JsonRead.recipientName, "RecipientName mismatch");
	public void confirmrecipientName()
	{
		
		BaseClass.getLogger().info("**********Verifying Recipient name***********");
		
		softAssert = new SoftAssert();
		WebElement elem = fdp.recipientName();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.recipientName, "RecipientName mismatch");
		softAssert.assertAll();
		
		BaseClass.getLogger().info("**********confirmrecipientName() successfully passed***********");

	}
	@Test(priority = 44,groups = { "Regression Test two" })
	public void confirmrecipientEmail()//soft assertion if fails run all further test cases
	{
		BaseClass.getLogger().info("**********Verifying recipient Email***********");
		
		WebElement elem = fdp.recipientEmail();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.correctemail, "recipientEmail mismatch");
		softAssert.assertAll();
		
		BaseClass.getLogger().info("**********confirmrecipientEmail() successfully passed***********");

	}
	@Test(priority = 45,groups = { "Regression Test two" })
	public void confirmrecipientMobile()
	{
		BaseClass.getLogger().info("**********Verifying recipient Mobile number***********");
		
		WebElement elem = fdp.recipientMobile();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.recipientmobile, "recipientMobile mismatch");
		softAssert.assertAll();
		
		BaseClass.getLogger().info("**********confirmrecipientMobile() successfully passed***********");

	}
	@Test(priority = 46,groups = { "Regression Test two" })
	public void confirmcustomerName()
	{
		BaseClass.getLogger().info("**********Verifying customer name***********");
		
		WebElement elem = fdp.customerName();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerName, "customerName mismatch ");
		softAssert.assertAll();
		
		BaseClass.getLogger().info("**********confirmcustomerName() successfully passed***********");

	}
	@Test(priority = 47,groups = { "Regression Test two" })
	public void confirmcustomerEmail()
	{
		BaseClass.getLogger().info("**********Verifying customer Email***********");
		
		WebElement elem = fdp.customerEmail();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerEmail, "customerEmail mismatch ");
		softAssert.assertAll();
		
		BaseClass.getLogger().info("**********confirmcustomerEmail() successfully passed***********");

	}
	@Test(priority = 48,groups = { "Regression Test two" })
	public void confirmcustomerMobile()
	{
		BaseClass.getLogger().info("**********Verifying customer mobile number***********");
		
		WebElement elem = fdp.customerMobile();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerMobile, "customerMobile mismatch ");
		softAssert.assertAll();
		
		BaseClass.getLogger().info("**********confirmcustomerMobile() successfully passed***********");

	}
	@Test(priority = 49,groups = { "Regression Test two" })
	public void confirmcustomerCity()
	{
		BaseClass.getLogger().info("**********Verifying customer city***********");
		
		WebElement elem = fdp.customerCity();
		System.out.println(elem.getText());
		String p = elem.getText();
		softAssert.assertEquals(p, JsonRead.customerAddress, "customerCity mismatch ");
		softAssert.assertAll();
		
		BaseClass.getLogger().info("**********confirmcustomerCity()successfully passed***********");

	}
	@Test(priority = 50,groups = { "Regression Test two" })
	public void confirmcustomerPinCode()
	{
		
		BaseClass.getLogger().info("**********Verifying customer pincode***********");
		
		WebElement elem = fdp.customerPinCode();
		//System.out.println(elem.getText());//gives both parts zip with city
		String elementText = elem.getText();
		String[] parts = elementText .split(",");
		String part1 = parts[0]; // "110059"//only zip
		System.out.println(part1);
		softAssert.assertEquals(part1, JsonRead.customerPin, "customerPinCode mismatch ");
		softAssert.assertAll();
	
		BaseClass.getLogger().info("**********confirmcustomerPinCode() successfully passed***********");

		BaseClass.getLogger().info("**********Finished TC_0005_ConfirmingFormDetails ************");
	}

		
}
