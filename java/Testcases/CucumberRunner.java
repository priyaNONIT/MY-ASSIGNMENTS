package Testcases;

import org.testng.annotations.DataProvider;

import Base.ProjectSpecificMethods;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features", glue={"Pages"},monochrome=true,publish=true)
public class CucumberRunner extends ProjectSpecificMethods{
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
		
	}
}
