package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAndDeselect {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/select-menu");
		
		//now what we do is find an element. Why?  Because of the requirement as we have to select the multiple drop-down.
		//1st we will find locators of particular dropdown.
		
		WebElement carDropDown = driver.findElement(By.id("cars"));
		
		//now we have to select any option from the dropdown by Using "Select()" or SELECT class It is  non-Static object.
		
		Select select = new Select(carDropDown); 
		
		// By using reference variable eg.(select is a refrence variable from above syntax) we can get particular name or WebElement from the list with the help of few method from SELECT class.
		
		Thread.sleep(2000);
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByVisibleText("Opel");
		
	
		
		
 

	}

}
