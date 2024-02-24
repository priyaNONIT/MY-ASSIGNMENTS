package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public ViewLeadPage verifyLeads() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
		System.out.println("Lead is created successfully");	
		} else {
        System.out.println("Lead is not created");
		}
		return this;
		
	}

	

}
