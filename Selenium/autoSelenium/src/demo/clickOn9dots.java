package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickOn9dots {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().frame(0);
		
		List<WebElement> listIcons = driver.findElements(By.xpath("//span[@class='MrEfLc']"));
		
		for(WebElement icons:listIcons) {
			String x = icons.getText();
			System.out.println(x);
		}
		
		
		
		

	}

}
