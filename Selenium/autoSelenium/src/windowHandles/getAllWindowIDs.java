package windowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllWindowIDs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//*[@id='announcement-banner']/div/div/div/h4/a")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[2]/a/span")).click();
		
		String allWindowIDs = driver.getWindowHandle();
		
		System.out.println(allWindowIDs);
		driver.quit();

	}

}
