package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {
		@Given("Enter the user name {string}")
	public LoginPage enterUserName(String uName) {
			getDriver().findElement(By.id("username")).sendKeys(uName);
		return this;

	}
@And("Enter the password as {string}")
public LoginPage enterPassword(String pWord) {
	getDriver().findElement(By.id("password")).sendKeys(pWord);
   return this;
	}
@When("Click login button")
public WelcomePage clickLoginButton() {
	getDriver().findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage();

}

}

