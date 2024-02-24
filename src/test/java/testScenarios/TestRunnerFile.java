package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/***********************************************************************************
*                                                                                  *
* Class Name     : HomePageByAtHome                                                * 
* Description    : To Get all the web elements present in the website              *
* 				   and to return the same.                                         *
*                                                                                  *
************************************************************************************/
//main source file all execution start from here
//all step definition feature file all run from here

//if you want all feature file just pass folder name 
//if you have some more feature file put , and give name
//glue keyword used to step definition file
//rerun use to run the failure test cases

@RunWith(Cucumber.class)
@CucumberOptions( 
		features= {".//featureFiles/UrbanLadder.feature"},
		glue="stepDefinition",
		plugin= {"pretty",
				"html:reports/myreportCucumber.html",
				"rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		tags="@sanity"
		//actual execution not done if dry run is true
		//dryRun=false,//to check every methods in feature file is implemented in  step definition
		//monochrome = true,//remove junk characters from console output
		//publish=true//share report to team gives url of report on console
		
		//tags="@sanity"//this will execute scenarios tagged with sanity in feature files

		)
public class TestRunnerFile {

}
