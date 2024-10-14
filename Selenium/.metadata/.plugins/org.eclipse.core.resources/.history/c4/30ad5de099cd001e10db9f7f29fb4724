package windowRelatedOperations;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetBydefaultByDimenssionOfChromeBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Dimension size = driver.manage().window().getSize();
		Point positon = driver.manage().window().getPosition();

		driver.close();
		System.out.println(size);
		System.out.println(positon);

	}

}
