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
* Class Name     : BasePage                                                        * 
* Description    : initialize the WebDriver instance and set up the PageFactory    *
* for the page objects.                                                            *
*                                                                                  *
************************************************************************************/

public class BasePage {
    WebDriver driver;
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
