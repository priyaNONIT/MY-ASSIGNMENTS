package Testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMethods;
import Pages.LoginPage;

public class RunCreateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		fileName="LeadCreate";
	}
	@Test(dataProvider="fetchData")
public void runCreateLead(String uName,String pWord,String cName,String fName,String lName) {
	LoginPage lp = new LoginPage(driver);
	lp.enterUserName(uName)
	.enterPassword(pWord)
	.clickLoginButton()
	.verifyHomePage()
	.clickCRMSFALink()
	.clickLeadsLink()
	.clickCreateLeadLink()
	.enterCompanyName(cName)
	.enterFirstName(fName)
	.enterLastName(lName)
	.clickSubmitButton()
	.verifyLeads();
}
}
