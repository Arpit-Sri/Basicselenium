package endToEndScript;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		WebElement linkA = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[1]/a"));
		
		
		Actions actionChains = new Actions(driver);
		Thread.sleep(5000);
		actionChains.moveToElement(linkA).click().perform();
		
		
	
		

	}

	

	

}
