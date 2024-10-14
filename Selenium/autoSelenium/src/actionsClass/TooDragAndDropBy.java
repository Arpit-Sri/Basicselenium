package actionsClass;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooDragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement dragAndDropFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(dragAndDropFrame);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		 Actions actions = new Actions(driver);
		 Thread.sleep(1000);
		 actions.dragAndDropBy(draggable, 70, 70);
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(1000);
		 WebElement api = driver.findElement(By.linkText("API documentation"));
		 api.click();
		 driver.quit();
		 
	
		

	}

}
