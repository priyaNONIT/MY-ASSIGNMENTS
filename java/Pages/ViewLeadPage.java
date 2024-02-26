package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewLeadPage extends ProjectSpecificMethods{

	
	@Then("ViewLeads page should be displayed(.*)$")
	public ViewLeadPage verifyLeads(String cName) {
		String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
		System.out.println("Lead is created successfully");	
		} else {
        System.out.println("Lead is not created");
		}
		return this;
		
	}

	

}
