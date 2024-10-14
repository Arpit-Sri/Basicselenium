package endToEndScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenANewTabWithSomeScenario {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/index.php");
		
		String FirstTabWebTitle = driver.getTitle();
		System.out.println("first tab Title:"+FirstTabWebTitle);
		
		//open a Newe Tab using SwitchTo method
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/");
		
		String secondTabWebTitle = driver.getTitle();
		System.out.println("Second tab Title:"+secondTabWebTitle);
		
		
		//navigate to first tab
		
		//driver.navigate().back();
		
		
		

	}

}
