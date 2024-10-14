package crazyHub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToVerifyTextLoginAfterClickingBuyNowButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://crazzyhub.com/");
		
		WebElement mobiles_and_tablets = driver.findElement(By.xpath("(//p[text()='Mobiles & Tablets'])[1]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(mobiles_and_tablets).perform();
		
		driver.findElement(By.xpath("//li[text()='Apple']")).click();
		
		driver.findElement(By.xpath("//p[text()='APPLE iPhone 14 Plus (Midnight, 512 GB)']")).click();
		
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		
		WebElement login = driver.findElement(By.xpath("//p[text()='Sign in to complete your shopping']"));
		
		String signIn = login.getText();
		
		if(signIn.contains("to complete your shopping"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
		
		
		
	}

}
