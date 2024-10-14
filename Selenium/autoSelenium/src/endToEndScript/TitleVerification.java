package endToEndScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" https://blazedemo.com/index.php");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = ("Welcome to the Simple Travel Agency! ");
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is displayed correctly :" +actualTitle);
			
		}
		else {
			
				System.out.println("Title is mismatch! Actual Title is :" +actualTitle);
		}
		
		
		
		driver.findElement(By.linkText("destination of the week! The Beach!")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}


