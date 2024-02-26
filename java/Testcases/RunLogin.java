package Testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMethods;
import Pages.LoginPage;

public class RunLogin extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		fileName="LoginEnter";
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String uName,String pWord) {
		LoginPage lp = new LoginPage();
		lp.enterUserName(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.verifyHomePage()
		.clickCRMSFALink();
		
	}

	
}
