package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;

public class ProjectSpecificMethods extends AbstractTestNGCucumberTests {
private static final ThreadLocal<ChromeDriver> chdriver=new ThreadLocal<ChromeDriver>();
public String fileName;
public void setDriver() {
	chdriver.set(new ChromeDriver());
}
public ChromeDriver getDriver() {
	return chdriver.get();
	
}

@BeforeMethod
public void precondition() {
	setDriver();
	getDriver().manage().window().maximize();
	getDriver().get("http://leaftaps.com/opentaps/control/main");
	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
@AfterMethod
public void postcondition() {
	getDriver().quit();
}
@DataProvider(name="fetchData",parallel=true)
public String[][] sendData() throws IOException {
	return ReadExcel.readExcel(fileName);
}
}
