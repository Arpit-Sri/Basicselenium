package pageSource;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheSourceCodeIsThereOrNotByUsingGetPageSource {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteCookie(null);
		
		driver.get("https://www.facebook.com/"); 
		
	
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		if(pageSource.contains("brand")) {
			System.out.println("Pass");
		}
		else {
			
			System.out.println("Fails");
		}
		driver.close();
	}
	

}
