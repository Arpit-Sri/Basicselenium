package takeScreenShot;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfWebPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//typeCasting-(TakeScreenShot)
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		ts.getScreenshotAs(null);
		
		

	}

}
