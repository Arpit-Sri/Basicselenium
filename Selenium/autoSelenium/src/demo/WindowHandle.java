package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.selenium.dev/");
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.makemytrip.com");
		
		Set<String> ID = driver.getWindowHandles();
		 
		for(String windowIDs:ID) {
			
			driver.switchTo().window(windowIDs);
			if(driver.getTitle().equals("#1 Travel Website 50% OFF on Hotels, Flights & Holiday"))
			{
				 System.out.println("Title::"+driver.getTitle()+"||"+"Window ID::"+windowIDs);
			}
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
