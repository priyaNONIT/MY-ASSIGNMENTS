package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public WelcomePage verifyHomePage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if (text.contains("Welcome")) {
			System.out.println("Home Page is Displayed");
			
		} else {
			System.out.println("Home page is not displayed"); 

		}
		return this;

	
	
	}
	public MyHomePage clickCRMSFALink() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage(driver);
		
	}
}
