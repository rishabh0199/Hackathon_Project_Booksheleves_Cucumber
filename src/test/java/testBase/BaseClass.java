package testBase;
/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
/***********************************************************************************
*                                                                                  *
* Class Name     : BaseClass                                               		   * 
* Description    : include all the methods reused in project .                     *
*                                                                                  *
************************************************************************************/
public class BaseClass {
	public static JSONParser parser;
	public static JSONObject jsonObject;
	public static Object obj;
	public static String amount;
	public static String recipientName;
	public static String recipientEmail;
	public static String customerName;
	public static String customerEmail;
	public static String customerMobile;
	public static String message;
	static Logger logger;
	
	public static WebDriver driver;
	public Properties p;//to import properties file
	
	//@BeforeGroups("Smoke Test one")
	@SuppressWarnings("deprecation")
	@BeforeTest
	@Parameters({"os","browser"})
	public void driverSetup(String os,String br) throws IOException
	{
		
		
		//loading properties file
		FileReader file = new FileReader(".//src/test/resources/config.properties");//class
		p=new Properties();//creating obj of Properties
		p.load(file);//load properties file
	
		
		
		
		//check on which envt want to run grid or local from config properties file
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//decide os
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WINDOWS);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("No matching OS...");
			}
			//decide browser
			switch(br.toLowerCase())
			{
			case "chrome" :
				capabilities.setBrowserName("chrome");
				break;
			case "edge":
				capabilities.setBrowserName("MicrosoftEdge");
				break;
			default :
				System.out.println("No matching browser..");
				return;
			}
			driver = new RemoteWebDriver(new URL("http://192.168.0.104:4444"),capabilities);//node/grid URL is fixed

		}
		
		else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			//switch(getProperties().getProperty("browser").toLowerCase){
			
			//1.launch based on condition-locally
			switch(br.toLowerCase())
			{
			case "chrome":
				driver = new ChromeDriver();break;
			case "edge":
				driver = new EdgeDriver();break;
			default:
				System.out.println("not matching browser");
				return;

			}
		}
		//2.for grid now add remote envt 

			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(p.getProperty("appURL"));
			driver.manage().window().maximize();
}
	//@AfterGroups("Regression Test two")
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	public void ExplicitlyWait(WebElement elem)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.visibilityOfAllElements(elem));
	}
	
	
	public void ExplicitlyWaitList(List<WebElement> elem)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.visibilityOfAllElements(elem));
	}
	
	public  Logger getLogger() 
	{		 
		//public Logger logger;//pre defined class come from Log4j2 dependency
		//Loading Log4j2 file
		//logger=LogManager.getLogger(this.getClass());//this.getClass will get current test class name running use logj4
		logger=LogManager.getLogger(); //Log4j
		return logger;
	}
	
	public void writeToFile(String fileName,String content) throws IOException
	{
		try(FileWriter fileWriter = new FileWriter(fileName))
		{
			fileWriter.write(content);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public String captureScreen(String tname) throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath= System.getProperty("user.dir")+"\\screenshotsofReport\\" + tname +"_" + timeStamp + ".png";
		File targetFile= new File(targetFilePath);
		FileUtils.copyFile(sourceFile, targetFile);
		//sourceFile.renameTo(targetFile);//copy source file to target file
		
		return targetFilePath;
	}
	
//	public void screenshot(String tname) throws IOException
//	{
//		String timeStamp = new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
//		
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//		
//		String targetFilePath= System.getProperty("user.dir")+"\\screenshots\\"+ tname+" "+timeStamp + ".png";
//		File targetFile= new File(targetFilePath);
//		FileUtils.copyFile(sourceFile, targetFile);	
//	}

	//for cucumber send browser using config file
	
//	public static Properties getproperties() throws IOException
//	{
//		Properties m;
//		//loading properties file
//		FileReader file = new FileReader(".//src/test/resources/config.properties");//class
//		m=new Properties();//creating obj of Properties
//		m.load(file);
//		return m;
//	}

}
