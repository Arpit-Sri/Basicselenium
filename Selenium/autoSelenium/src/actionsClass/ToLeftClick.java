package actionsClass;

import java.time.Duration;  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLeftClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.click(checkbox).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
