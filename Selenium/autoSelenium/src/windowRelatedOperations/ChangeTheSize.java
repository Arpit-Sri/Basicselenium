package windowRelatedOperations;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeTheSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Dimension defaultSize = driver.manage().window().getSize();
		
		System.out.println("It is a by default size :" + defaultSize);
		
		
		//now we have to chage te size from default to new which is given(in question). first we make an object and its return type is Dimension. 
		//for Size we use new Point(intx ,intY)
		Dimension d = new Dimension(600, 700);
		
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Dimension newSize = driver.manage().window().getSize();
		System.out.println("It is new size :" +newSize);
		
		driver.quit();

	}

}
