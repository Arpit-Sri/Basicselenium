package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveToElementUsingCoordinates {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://amp.dev/documentation/examples/websites/interactivity-dynamic-content/star_rating/?redirected");
		
		WebElement star1 = driver.findElement(By.id("rating1"));
		
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(star1, 50, 0).perform();
		Thread.sleep(3000);
		driver.close();	
		
	}

}
