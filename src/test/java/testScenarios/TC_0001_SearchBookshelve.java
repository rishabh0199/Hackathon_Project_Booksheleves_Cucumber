package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.testng.annotations.Test;
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
			uhp = new UrbanLadderHomePage(driver);
			uhp.inputBox();

		}
		
		@Test(priority = 2, groups = { "Smoke Test one" })
		public void clicksearch()
		{
			uhp.clickSearch();
		}
}
