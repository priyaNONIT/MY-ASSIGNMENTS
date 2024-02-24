package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.ReadExcel;

public class ProjectSpecificMethods {
public ChromeDriver driver;
public String fileName;
@BeforeMethod
public void precondition() {
	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
@AfterMethod
public void postcondition() {
	driver.quit();
}
@DataProvider(name="fetchData")
public String[][] sendData() throws IOException {
	return ReadExcel.readExcel(fileName);
}
}
