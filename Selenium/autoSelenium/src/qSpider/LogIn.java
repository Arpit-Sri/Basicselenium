package qSpider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		
		WebElement name = driver.findElement(By.id("name"));
		Thread.sleep(2000);
		name.sendKeys("Arpit Sri");
		
		WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		email.sendKeys("theundefined04@gmail.com");
			
		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		password.sendKeys("12345");
		
		driver.findElement(By.xpath(null));
	
		
		

	}

}
