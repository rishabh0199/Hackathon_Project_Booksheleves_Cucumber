package testScenarios;

/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.testng.annotations.Test;
import pageObjects.LivingSubMenuPage;
import testBase.BaseClass;
import utilities.ExcelWrite;
/***********************************************************************************
*                                                                                  *
* Class Name     : TC_0003_LivingMenuItems                                         * 
* Description    : store and print all the seating and chair options available     *
* 					according to requirements.                                     *
*                                                                                  *
************************************************************************************/
public class TC_0003_LivingMenuItems extends BaseClass{
	public static String[] submenuitems;
	
	LivingSubMenuPage lmp;
	
	
	@Test(priority = 15,groups = { "Regression Test one" })
	public void scrollPageUp()
	{
		lmp=new LivingSubMenuPage(driver);
		lmp.scrollUp();
	}
	
	@Test(priority = 16,groups = { "Regression Test one" })
	public void hoverToLiving()
	{
		lmp.hoverLiving();
	}
	@Test(priority = 17,groups = { "Regression Test one" })
	public void waitforSubmenu()
	{
		lmp.waitForSubmenuToAppear();
	}
	
	@Test(priority = 18,groups = { "Regression Test one" })
	public void submenuSeatingandChairStoreInExcel()
	{
		submenuitems= new String[lmp.listOFseatingAndChair().size()];
		
		for(int i=0;i<lmp.listOFseatingAndChair().size();i++)
		{
			submenuitems[i]= lmp.listOFseatingAndChair().get(i).getText();
		}
		ExcelWrite.setDataExcel(submenuitems, lmp.listOFseatingAndChair().size());
	}
	@Test(priority = 19,groups = { "Regression Test one" })
	public void displaySubMenuSeatingandChair()
	{
		System.out.println("The submenu items under Seating and Chaires:");
		for(int i=0;i<lmp.listOFseatingAndChair().size();i++)
		{
			System.out.println(submenuitems[i]);
		}
	}


}
