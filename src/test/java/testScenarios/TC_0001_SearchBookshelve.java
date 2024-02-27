package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pageObjects.UrbanLadderHomePage;
import testBase.BaseClass;
/***********************************************************************************
*                                                                                  *
* Class Name     : TC_0001_SearchBookshelve                                        * 
* Description    : Searching for Bookshelve from the Website main page             *
*                                                                                  *
************************************************************************************/
public class TC_0001_SearchBookshelve extends BaseClass{
	 UrbanLadderHomePage uhp;
		
		@Test(priority = 1, groups = { "Smoke Test one" })
		public void sendInSearch()
		{
			BaseClass.getLogger().info("**********Starting TC_0001_SearchBookshelve************");
			BaseClass.getLogger().info("**********Passing input in search Bar************");
			
			uhp = new UrbanLadderHomePage(driver);
			uhp.inputBox();
			
			BaseClass.getLogger().info("**********sendInSearch() successfully passed************");
		}
		
		@Test(priority = 2, groups = { "Smoke Test one" })
		public void clicksearch()
		{
			BaseClass.getLogger().info("**********Clicking Search Button************");
			
			uhp.clickSearch();
					
			BaseClass.getLogger().info("**********clicksearch() successfully passed************");
			BaseClass.getLogger().info("**********Finished TC_0001_SearchBookshelve************");
		}
}
