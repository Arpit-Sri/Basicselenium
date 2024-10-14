package crazyHub;

import java.time.Duration ; 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchAndAddToCart {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://crazzyhub.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class=\"!w-[400px] outline-none bg-transparent px-4\"]"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(search, "iphone").sendKeys(Keys.ENTER).perform();  
		
		
		
		
		
		
	}

}
