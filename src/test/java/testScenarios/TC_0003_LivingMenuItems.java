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
		BaseClass.getLogger().info("**********Starting TC_0003_LivingMenuItems************");
		BaseClass.getLogger().info("**********Scrolling Page Up to Living************");
		
		lmp=new LivingSubMenuPage(driver);
		lmp.scrollUp();
		
		BaseClass.getLogger().info("**********scrollPageUp() Successfuly passed************");
	}
	
	@Test(priority = 16,groups = { "Regression Test one" })
	public void hoverToLiving()
	{
		BaseClass.getLogger().info("*********Hovering to Living option************");
		
		lmp.hoverLiving();
		
		BaseClass.getLogger().info("**********hoverToLiving() Successfuly passed************");
	}
	@Test(priority = 17,groups = { "Regression Test one" })
	public void waitforSubmenu()
	{
		BaseClass.getLogger().info("*********Waiting for Submenu to appear************");
		
		lmp.waitForSubmenuToAppear();
		
		BaseClass.getLogger().info("**********waitforSubmenu() Successfuly passed************");
	}
	
	@Test(priority = 18,groups = { "Regression Test one" })
	public void submenuSeatingandChairStoreInExcel()
	{
		BaseClass.getLogger().info("*********Fetching and Storing Submenu Items in Excel************");
		
		submenuitems= new String[lmp.listOFseatingAndChair().size()];
		
		for(int i=0;i<lmp.listOFseatingAndChair().size();i++)
		{
			submenuitems[i]= lmp.listOFseatingAndChair().get(i).getText();
		}
		ExcelWrite.setDataExcel(submenuitems, lmp.listOFseatingAndChair().size());
		BaseClass.getLogger().info("**********submenuSeatingandChairStoreInExcel() Successfuly passed************");
	}
	@Test(priority = 19,groups = { "Regression Test one" })
	public void displaySubMenuSeatingandChair()
	{
		BaseClass.getLogger().info("*********Printing the Submenu options on console************");
		
		System.out.println("The submenu items under Seating and Chaires:");
		for(int i=0;i<lmp.listOFseatingAndChair().size();i++)
		{
			System.out.println(submenuitems[i]);
		}
		BaseClass.getLogger().info("*********Waiting for Submenu to appear************");
		BaseClass.getLogger().info("**********displaySubMenuSeatingandChair() successfully passed************");
	}


}
