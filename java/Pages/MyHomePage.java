package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyLeadPage clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage(driver);
		
	}

}
