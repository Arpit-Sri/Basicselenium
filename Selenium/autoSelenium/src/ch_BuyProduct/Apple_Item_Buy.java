package ch_BuyProduct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Apple_Item_Buy {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://crazzyhub.com/");
		
		WebElement mob_and_tab = driver.findElement(By.xpath("//p[text()='Mobiles & Tablets']"));
	
		
		Actions action = new Actions(driver);

		action.moveToElement(mob_and_tab).perform();
		
		driver.findElement(By.xpath("//li[text()= 'Apple']")).click();
		
		

	}

}
