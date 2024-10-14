package windowHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		
		//writing the program to fetch the window ID of the parent window 
		
		WebDriver driver = new ChromeDriver();
		
		//now using getwindow method to fetch the window ID.
	
		String windowID = driver.getWindowHandle();
		
		System.out.println(windowID);
		
		

	}

}
