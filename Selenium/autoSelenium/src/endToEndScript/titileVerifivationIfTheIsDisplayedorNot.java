package endToEndScript;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class titileVerifivationIfTheIsDisplayedorNot {

	public static void main(String[] args) {
		
	
				
				ChromeDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://blazedemo.com/index.php ");
				
				//it will get the title from the h0mepage of the application or webpage.
				String actualTitle = driver.getTitle();
				 
			
				//to print the title from the web page in the console
				//System.out.println(actualTitle);
				
				//we also know the expected Title(which is given) thn after we will compare b/w actual and expected title is the title is printed what we expected
				String expectedTitle = ("BlazeDemo");
				
				//if only consider boolean so we are using .euals method for eg) if(x==4) or if (y==3) for String we have "equals" method
				if(actualTitle.equals(expectedTitle)){

						System.out.println("Title is dislpalyded correctly :" +actualTitle);
				}
				else {
						System.out.println("Title is mismatch! Actual Title is :" +actualTitle);
					
				}
				
				
				
				driver.close();
				

		}
			
			
		

	}

