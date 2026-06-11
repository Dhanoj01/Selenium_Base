package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayy16_WebElementMethods {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.example.com/");
		
		WebElement input = driver.findElement(By.id("input"));
	
	    String attributeValue = input.getAttribute("value");
	    
	    String text = input.getText();
	    
	    WebElement checkBox = driver.findElement(By.id("checkbox"));
	    
	   boolean displayed =  checkBox.isDisplayed();
	    
	   boolean enable =   checkBox.isEnabled();
	    
	    boolean selected = checkBox.isSelected();
	    
	    
	
	}

}
