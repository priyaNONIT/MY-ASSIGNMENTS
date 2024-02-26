package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class MyLeadPage extends ProjectSpecificMethods {

	
@And("Click Createlead link")
	public CreateLeadPage clickCreateLeadLink() {
	getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

}
