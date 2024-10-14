package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationToMultiBrowser {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	      
	       driver.get("https://www.google.com/");
	     Navigation nav = driver.navigate();
	     Thread.sleep(3000);
	     nav.to("https://www.instagram.com/");
	     Thread.sleep(3000);
	     nav.to("https://www.facebook.com/");
	     nav.back();
	     Thread.sleep(5000);
	     nav.getClass();
	     Thread.sleep(5000);
	     nav.refresh();
	     
	     
	     Thread.sleep(1000);
	     driver.quit();;
	     

	}

}
