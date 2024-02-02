package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.finance.yahoo.com/");
		driver.findElement(By.xpath("//a[text()=\"Crypto\"]")).click();
		String name = driver.findElement(By.xpath("//div[@class=\"Ovx(a) Ovx(h)--print Ovy(h) W(100%) \"]/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(name);
		List<WebElement> cryp = driver.findElements(By.xpath("//div[@class=\"Ovx(a) Ovx(h)--print Ovy(h) W(100%) \"]/table/tbody//td[2]"));
		// TODO Auto-generated method stub
		for (WebElement currency : cryp) {
			System.out.println( currency.getText());
			
		}

	}

}
