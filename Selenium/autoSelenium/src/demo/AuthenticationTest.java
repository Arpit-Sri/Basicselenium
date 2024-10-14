package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationTest {

    public static void main(String[] args) {
        

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
            // Open the main page (abc.com)
            driver.get("https://www.abc.com");

            // Locate and click the link that opens the authentication window
            WebElement link = driver.findElement(By.linkText("Your Link Text Here"));
            link.click();

            // Switch to the authentication window (assuming it's a JavaScript alert)
            String authenticationWindowText = "Authentication Window Title"; // Change this to the actual window title
            driver.switchTo().alert().accept(); // Accept the alert

            // Perform actions in the authentication window
            WebElement usernameField = driver.findElement(By.id("username")); // Change this to the actual username field ID
            WebElement passwordField = driver.findElement(By.id("password")); // Change this to the actual password field ID
            WebElement loginButton = driver.findElement(By.id("loginButton")); // Change this to the actual login button ID

            // Enter credentials
            usernameField.sendKeys("yourUsername");
            passwordField.sendKeys("yourPassword");

            // Click the login button
            loginButton.click();

            // You can add assertions or verifications here based on the expected behavior

            // Close the browser window
            //driver.quit();
        }
    }


