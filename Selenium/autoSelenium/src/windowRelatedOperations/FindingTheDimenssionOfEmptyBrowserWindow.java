package windowRelatedOperations;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindingTheDimenssionOfEmptyBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		Dimension size = driver.manage().window().getSize();
		Point positon = driver.manage().window().getPosition();

		
		System.out.println(size);
		System.out.println(positon);
		driver.close();
		
	}

}
