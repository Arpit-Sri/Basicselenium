package ch_BuyProduct;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.youtube.com/");
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.selenium.dev/downloads/");
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.facebook.com/");
		
		
	

	}

}
