package endToEndScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		String windowID = driver.getWindowHandle();
		
		System.out.println(windowID);
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		
		driver.quit();

	}

}
