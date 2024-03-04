package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccountSteps extends BaseClass {
	
	/*
	 * @Given("Enter the user name {string}") public void enterUserName(String
	 * uName) { driver.findElement(By.id("username")).sendKeys(uName);
	 * 
	 * }
	 * 
	 * @And("Enter the password as {string}") public void enterPassWord(String
	 * pWord) { driver.findElement(By.id("password")).sendKeys(pWord);
	 * 
	 * }
	 * 
	 * @When("Click login button") public void clickLoginButton() {
	 * driver.findElement(By.className("decorativeSubmit")).click();
	 * 
	 * }
	 * 
	 * @Then("Homepage should be displayed") public void verifyHomePage() { String
	 * text = driver.findElement(By.tagName("h2")).getText(); if
	 * (text.contains("Welcome")) { System.out.println("Home Page is Displayed");
	 * 
	 * } else { System.out.println("Home page is not displayed");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @When("Click on crmsfa link") public void clickCRMSFALink() {
	 * driver.findElement(By.linkText("CRM/SFA")).click(); }
	 */	 
	@And("Click Accounts link")
	public void clickAccLink() {
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	}

	@And("Click FindAccounts link")
	public void clickFindAccountlink() {
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
	}
	@And("Click Account TextBox")
	public void clickAccountTextBox() {
		driver.findElement(By.xpath("//input[@id='ext-gen27']")).click();

	}

	@Given("Enter AccountName as DAccount")
	public void enterAccName() {
		driver.findElement(By.xpath("//input[@id='ext-gen27']")).sendKeys("NewAc");

	}

	@When("Click Find Accounts link")
	public void clickFindAccounts() {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}
	@And("Click Found Account")
	public void clickAccountList() {
		driver.findElement(By.xpath("//a[text()='NewAc']")).click();
		}
	@And("Click Edit link")
	public void clickEditlink() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}

	@And("Clear AccountName")
	public void clearAccountName() {
		WebElement accountname = driver.findElement(By.xpath("//input[@id='accountName']"));
		accountname.clear();
	}

	@Given("Enter New Account")
	public void enterAccountname() {
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("EAccount");

	}

	@And("Click Save button")
	public void clickSaveButton() {
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
	}
	@And("Verify Edited Account")
	public void verifyEditedAccount() {
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[4]")).getText();
		System.out.println(text);
		if (text.contains("Draw")) {
			System.out.println("Account edited successfully");
		} else {
			System.out.println("Account not edited");

		}
	}
	@And("Deactivate Account")
	public void deleteAccount() {
		driver.findElement(By.xpath("//a[text()='Deactivate Account']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.xpath("//span[@class='subSectionWarning']")).getText();
		if (text.contains("deactivated")) {
			System.out.println("Account deleted");
			} else {
				System.out.println("Account not deleted");

		}
	}
}
