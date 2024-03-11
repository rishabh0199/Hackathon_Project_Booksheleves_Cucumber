package pageObjects;
/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;

/***********************************************************************************
*                                                                                  *
* Class Name     : LivingSubMenuPage                                               * 
* Description    : To Get all the web elements present in the website              *
* 				 Living option and perform there corresponding actions.            *
*                                                                                  *
************************************************************************************/
public class LivingSubMenuPage extends BasePage{
	 BaseClass bclass;
		
	public LivingSubMenuPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@href='/help']")
	WebElement textScrollTill;
	
	@FindBy(xpath="//li[@class=\"topnav_item livingunit\"]")
	WebElement optHoverLiving;
	
	@FindBy(xpath="//li[@class='topnav_item livingunit']//a[contains(text(),'Chair')]")
	WebElement txtSeatingChair;
	
	@FindAll(@FindBy(xpath="//li[@class=\"topnav_item livingunit\"]//div//div//ul//li[1]//ul//li"))
	List<WebElement> listOfSeatingandChairitems;
	
	
	public void scrollPageUp()
	{ 
		bclass = new BaseClass();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		bclass.ExplicitlyWait(textScrollTill);
		js.executeScript("arguments[0].scrollIntoView(true);", textScrollTill);		
	}
	
	
	public void hoverLiving()
	{
		
		Actions action = new Actions(driver);
		bclass.ExplicitlyWait(optHoverLiving);
		action.moveToElement(optHoverLiving).perform();;
	}
	
	public void waitForSubmenuToAppear()
	{
		bclass.ExplicitlyWait(txtSeatingChair);
	}
	
	public List<WebElement> listOFseatingAndChair()
	{
		bclass.ExplicitlyWaitList(listOfSeatingandChairitems);
		return listOfSeatingandChairitems;
	}
	
	
}
