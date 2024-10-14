package pacto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DocLIst1 {

	public static void main(String[] args) {
		
		  // Set the path to your chromedriver
       

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.practo.com/Thrissur/doctors");
      
        

        // List of doctors
        List<WebElement> doctors = driver.findElements(By.xpath("//div[@class='info-section']"));

        for (WebElement doctor : doctors) {
            List<WebElement> patientStories = doctor.findElements(By.xpath(".//span[contains(text(), 'Patient Stories')]"));
            if (patientStories.isEmpty()) {
                String doctorName = doctor.findElement(By.xpath(".//h2")).getText();
                System.out.println(doctorName);
		
            }
        }
	}

}
