package crazyHub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyAddToCart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://crazzyhub.com/");
		
		WebElement search_TF = driver.findElement(By.xpath("//input[@class=\"!w-[400px] outline-none bg-transparent px-4\"]"));

		Actions actions = new Actions(driver);
		
		actions.sendKeys(search_TF, "iphone").sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//p[text()='APPLE iPhone 14 Plus (Midnight, 512 GB)']")).click();
		driver.findElement(By.xpath("//button[text()='Add To Cart']")).click();
		
		
		
	}

}
