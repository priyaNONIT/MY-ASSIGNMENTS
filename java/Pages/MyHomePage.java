package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class MyHomePage extends ProjectSpecificMethods{

	
	@And("Click leads link")
	public MyLeadPage clickLeadsLink() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadPage();
		
	}

}
