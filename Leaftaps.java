package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftaps {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Assigntaps");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Assign");
		
		WebElement dropdown =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select obj=new Select(dropdown);
		obj.selectByIndex(4);
		WebElement dropdown1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select obj1=new Select(dropdown1);
		obj1.selectByVisibleText("Automobile");
		WebElement dropdown2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select obj2=new Select(dropdown2);
		obj2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		driver.getTitle();
		String title=driver.getTitle();
		System.out.println("Title of the webpage;"+title);
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
