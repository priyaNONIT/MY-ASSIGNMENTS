package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage (ChromeDriver driver){
		this.driver=driver;
	}
	
	public CreateLeadPage enterCompanyName(String cName){
		driver.findElement(By.id("creatLeadForm_companyName")).sendKeys(cName);
		return this;
		
	}
	public CreateLeadPage enterFirstName(String fName){
		driver.findElement(By.id("creatLeadForm_firstName")).sendKeys(fName);
		return this;
		
	}
	public CreateLeadPage enterLastName(String lName){
		driver.findElement(By.id("creatLeadForm_lastName")).sendKeys(lName);
		return this;
		
	}
	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}

	}
