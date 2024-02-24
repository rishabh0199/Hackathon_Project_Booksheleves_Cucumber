package pageObjects;

/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/***********************************************************************************
*                                                                                  *
* Class Name     : HomePageByAtHome                                                * 
* Description    : To Get all the web elements present in the website              *
* 				   and to return the same.                                         *
*                                                                                  *
************************************************************************************/

public class BasePage {
    WebDriver driver;
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
