package AllConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9_Waits {

	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.example.com/");
		
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Explicit wait 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait until element is visible
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	        
	    //wait until element is clickable
	    WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		
	    
	    //wait until alert is present
	    wait.until(ExpectedConditions.alertIsPresent());
	    
	    //wait Title contains text
	    wait.until(ExpectedConditions.titleContains("dashboard"));
	    
	    
	    driver.quit();
	    
	    
	}
}
