package windowRelatedOperations;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeThePosition {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//You can navigate any URL (Optional)
		driver.get("https://www.facebook.com/");
		
		//To fetch the default position of the window and printing the default position
		Point defaultPostition = driver.manage().window().getPosition();
		System.out.println("Your default position is :"+defaultPostition);
		
		//now we have to chage te positon from default to new which is given(in question). first we make an object and its return type is Point. 
		//for Position we use new Point(intx ,intY)
		Point d = new Point(300, 20);
		Thread.sleep(3000);
		driver.manage().window().setPosition(d);
	
		//To fetch the new position of the window and printing(optional) the default position
		Point newPosition = driver.manage().window().getPosition();
		System.out.println("Yor new Position is :"+ newPosition);
		
		Thread.sleep(2000);
		driver.quit();
		   
		
	
		
	}

}
