package windowRelatedOperations;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SomeOperationsusindWindowInterface {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		
		Dimension size = driver.manage().window().getSize();
		
		Point positon = driver.manage().window().getPosition();
		
		System.out.println(size);
		System.out.println(positon);
		
		
	

	}

}
