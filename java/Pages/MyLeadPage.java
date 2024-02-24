package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods {

	public MyLeadPage(ChromeDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}

}
