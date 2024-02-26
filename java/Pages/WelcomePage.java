package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethods {
	
	@Then("Homepage should be displayed")
	public WelcomePage verifyHomePage() {
		String text = getDriver().findElement(By.tagName("h2")).getText();
		if (text.contains("Welcome")) {
			System.out.println("Home Page is Displayed");
			
		} else {
			System.out.println("Home page is not displayed"); 

		}
		return this;

	
	
	}
	@When("Click on crmsfa link")
	public MyHomePage clickCRMSFALink() {
		getDriver().findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage();
		
	}
}
