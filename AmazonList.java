package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https:www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
	   List<WebElement> price = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
	   int pricesize = price.size();
	   System.out.println("All prizes:"+pricesize);
	   List<Integer> list=new ArrayList<Integer>();
	   for (WebElement order:price) {
		   String text = order.getText().replaceAll(",", "");
		   int result = Integer.parseInt(text);
		   list.add(result);
	   }
		// TODO Auto-generated method stub
	   Collections.sort(list);
	   System.out.println(list);

	}

}
