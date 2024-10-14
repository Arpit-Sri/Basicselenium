package crazyHub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToFilterAllProducts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://crazzyhub.com/");
		
		driver.findElement(By.xpath("//p[text()='All Products']")).click();
		
		driver.findElement(By.xpath("//span[text()='200000']"));
		
		Actions action = new Actions(driver);
		
		action.moveByOffset(154, 239).click().perform();
		
		WebElement star1 = driver.findElement(By.xpath("//span[text()='5 Stars']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", star1);
		
		
		
	}

}
