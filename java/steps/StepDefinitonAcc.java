package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitonAcc extends BaseClass{
	/*
	 * public ChromeDriver driver;
	 * 
	 * @Given("Launch the browser") public void launchBrowser() { driver=new
	 * ChromeDriver();
	 * 
	 * }
	 * 
	 * @And("Load the Url") public void loadUrl() {
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 	}*/
	@Given("Enter the user name {string}")
 public void enterUserName(String uName) {
	 driver.findElement(By.id("username")).sendKeys(uName);
	 
 }
	@And("Enter the password as {string}")
	public void enterPassWord(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);

	}
	@When("Click login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if (text.contains("Welcome")) {
			System.out.println("Home Page is Displayed");
			
		} else {
			System.out.println("Home page is not displayed"); 

		}

}
	@When("Click on crmsfa link")
	public void clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click accounts link")
	public void clickAccountLink() {
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	}
	@And("Click create account link")
	public void clickCreateAccountLink() {
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
	}
	@Given("Enter Account Name as (.*)$")
	public void enterAccountName(String aName) {
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys(aName);
		
	}
	@And("Enter Local Name as (.*)$")
	public void enterLocalName(String lName) {
		driver.findElement(By.xpath("//input[@id=\"groupNameLocal\"]")).sendKeys(lName);
	}
	@And("Enter Phone Number as (.*)$")
	public void enterPhoneNumber(String pNo) {
		driver.findElement(By.xpath("//input[@id=\"primaryPhoneNumber\"]")).sendKeys(pNo);
	}
	@When("Click create account button")
	public void clickCreateAccountButton() {
	driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();	
	}
	@Then("Account Details page should be displayed (.*)$")
	public void verifyAccountsPage(String aName) {
		String text = driver.findElement(By.xpath("(//span[@class=\"tabletext\"])[3]")).getText();
		System.out.println(aName);
		if (text.contains(aName)) {
         System.out.println("Account created successfully");			
		} else {
			System.out.println("Account not created");

		}
		//driver.close();
	}
	
}