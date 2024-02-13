package week6.day2;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SchoolRegistration {
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		return SchoolReadExcel.readExcel("w3school");
	}
	@Test(dataProvider="fetchData")
	public void registration(String cName,String cNum,String cV,String fName,String eMail,String aD,String ciName,String zIp,String stName){
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement frame1=	driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));
    driver.switchTo().frame(frame1);
    driver.findElement(By.xpath("//input[@id=\"cname\"]")).sendKeys( cName);
	driver.findElement(By.xpath("//input[@id=\"ccnum\"]")).sendKeys(cNum);
	driver.findElement(By.xpath("//input[@id=\"expmonth\"]")).sendKeys("October");
	driver.findElement(By.xpath("//input[@id=\"cvv\"]")).sendKeys(cV);
	driver.findElement(By.xpath("//input[@id=\"expyear\"]")).sendKeys("2018");

    driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys(fName);
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(eMail);
	driver.findElement(By.xpath("//input[@id=\"adr\"]")).sendKeys(aD);
	driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys(ciName);
	driver.findElement(By.xpath("//input[@id=\"zip\"]")).sendKeys(zIp);
	driver.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys(stName);
	
	//driver.close();
	}
	
	

}
