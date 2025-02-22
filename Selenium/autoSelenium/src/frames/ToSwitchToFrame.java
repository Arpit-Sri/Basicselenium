package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToFrame {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Lenvo/Desktop/frame.html");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();

	}

}
