package crazyHub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAddCartAndVerify {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://crazzyhub.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class=\"!w-[400px] outline-none bg-transparent px-4\"]"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(search, "iphone").sendKeys(Keys.ENTER).perform(); 
		
		driver.findElement(By.xpath("//p[text()='APPLE iPhone 14 Plus (Midnight, 512 GB)']")).click();
		
		driver.findElement(By.xpath("//button[text()='Add To Cart']")).click();
		
		WebElement Cart = driver.findElement(By.xpath("//span[@class=\"lg:flex hidden gap-1 items-center\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", Cart);
		
		WebElement productcode = driver.findElement(By.xpath("//p[text()='3363']"));
		
		String code = productcode.getText();
		
		System.out.println(code);
		
		if(code.equals("Product ID: 3363"))
		{
			System.out.println("iphone added in cart");
		}
		else
		{
			System.out.print("not added");
		}
		
	}

}
