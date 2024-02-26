package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	@Given("Enter the companyname as (.*)$")
	public CreateLeadPage enterCompanyName(String cName){
		getDriver().findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys(cName);
		return this;
		
	}
	@And("Enter firstname as (.*)$")
	public CreateLeadPage enterFirstName(String fName){
		getDriver().findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys(fName);
		return this;
		
	}
	@And("Enter lastname as (.*)$")
	public CreateLeadPage enterLastName(String lName){
		getDriver().findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys(lName);
		return this;
		
	}
	@When("click on createlead button")
	public ViewLeadPage clickSubmitButton() {
		getDriver().findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage();
	}

	}
