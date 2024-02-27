package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.BookshelevesHomePage;
import testBase.BaseClass;
import utilities.ExcelWrite;
/***********************************************************************************
*                                                                                  *
* Class Name     : TC_0002_BookshelvesDetails                                      * 
* Description    : Get all the Bookshelves available according to requirement      *
* 					store and display.                                        	   *
*                                                                                  *
************************************************************************************/
public class TC_0002_BookshelvesDetails extends BaseClass{
	
    BookshelevesHomePage bhp;
	public static Actions action;
	public static String[] bookShelves;
	public static String[] prices;
	
	
	@Test(priority = 3,groups = { "Smoke Test one" })
	public void closePopUp() {
		bhp = new BookshelevesHomePage(driver);
		bhp.popupclose();
		
	}
	@Test(priority = 4,groups = { "Smoke Test one" })
	public void scrollDown()
	{
		BaseClass.getLogger().info("**********Starting TC_0002_BookshelvesDetails************");
		BaseClass.getLogger().info("**********Scrolling Down to Bookshelves************");
		
		bhp.scroll();
		
		BaseClass.getLogger().info("**********scrollDown() successfully passed************");
	}
	@Test(priority = 5,groups = { "Smoke Test one" })
	public void hoverCategory()
	{
		BaseClass.getLogger().info("**********Hovering to category************");
		
		bhp.hoverCategory();
		
		BaseClass.getLogger().info("**********hoverCategory() successfully passed************");
	}
	@Test(priority = 6,groups = { "Smoke Test one" })
	public void bookshelveCategory()
	{
		BaseClass.getLogger().info("**********Selecting Bookshelve category************");
		
		bhp.selectCategory();
		
		BaseClass.getLogger().info("**********bookshelveCategory() successfully passed************");
	}
	@Test(priority = 7,groups = { "Smoke Test one" })
	public void hoverToPrice()
	{
		BaseClass.getLogger().info("**********Hovering to price************");
		
		bhp.hoverPrice();
		
		BaseClass.getLogger().info("**********hoverToPrice() successfully passed************");
	}
	@Test(priority = 8,groups = { "Smoke Test one" })
	public void waitPriceSlider()
	{
		BaseClass.getLogger().info("**********Waiting for Price Slider************");
		
		bhp.waitForSlider();
		
		BaseClass.getLogger().info("**********waitPriceSlider() successfully passed************");
	}
	@Test(priority = 9,groups = { "Smoke Test one" })
	public void slidePriceamount() throws InterruptedException
	{
		BaseClass.getLogger().info("**********Sliding price************");
		
		bhp.slidePrice();
		
		BaseClass.getLogger().info("**********slidePriceamount() successfully passed************");
	}

	@Test(priority = 10,groups = { "Smoke Test one" })
	public void hoverSortBy()
	{
		BaseClass.getLogger().info("**********Hovering to sort By************");
		
		bhp.hoverSort();
		
		BaseClass.getLogger().info("**********hoverSortBy() successfully passed************");
	}
	@Test(priority = 11,groups = { "Smoke Test one" })
	public void sortAccToPrice()
	{
		BaseClass.getLogger().info("**********Selecting sorting High to low************");
		
		bhp.selectSortHighToLow();
		
		BaseClass.getLogger().info("**********sortAccToPrice() successfully passed************");
	}
	
	@Test(priority = 12,groups = { "Smoke Test one" })
	public void inStock()
	{
		BaseClass.getLogger().info("**********Selecting In Stock option************");
		
		bhp.inStockSelction();
		
		BaseClass.getLogger().info("**********inStock() successfully passed************");
	}
	
	@Test(priority = 13,groups = { "Smoke Test one" })
	public void collectingBookShelvesList() {
		BaseClass.getLogger().info("**********Collecting Bookshelves and Storing to Excel************");
		
		bookShelves = new String[bhp.bookShelvesNames().size()];
		prices = new String[bhp.bookShelvesPrice().size()];
		
		for(int i=0; i<bhp.bookShelvesNames().size(); i++) {
			
			bookShelves[i] = bhp.bookShelvesNames().get(i).getText();
			prices[i] = bhp.bookShelvesPrice().get(i).getText();
			prices[i] = prices[i].replaceAll("[^0-9]", "");
			
		}
		ExcelWrite.setDataExcel(bookShelves , prices , 3);
		
		BaseClass.getLogger().info("**********collectingBookShelvesList() successfully passed************");
	}
	
	@Test(priority = 14,groups = { "Smoke Test one" })
	public void displayingBookShelves() {
		
		BaseClass.getLogger().info("**********Printing the Bookshelves on console************");
		
		System.out.println("The Bookshelevs under 15000:-");
		for(int i=0; i<3; i++) {
			System.out.println(bookShelves[i] + " - Rs." + prices[i]);
			
		}
		BaseClass.getLogger().info("**********displayingBookShelves() successfully passed************");
		BaseClass.getLogger().info("**********Finished TC_0002_BookshelvesDetails************");
	}
	
	

}
