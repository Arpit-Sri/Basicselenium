package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.facebook.com/");
			
			
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("theunndefined@gmail.com");
			
			Thread.sleep(3000);
			
			WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("arpi111t");
			
			driver.findElement(By.name("login")).click();
	}

}
