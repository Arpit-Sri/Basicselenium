package crazyHub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLogIn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://crazzyhub.com/");
		
		driver.findElement(By.xpath("//p[text()='Sign In']")).click();
		
		WebElement inputtext = driver.findElement(By.xpath("//input[@aria-invalid=\"false\"]"));
		
		inputtext.sendKeys("7510006028");
		
		driver.findElement(By.xpath("//button[text()=' Log In']")).click();
		}

}
