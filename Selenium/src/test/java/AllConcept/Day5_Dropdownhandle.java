package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day5_Dropdownhandle {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        // Locate dropdown
        WebElement dropdown =
                driver.findElement(By.id("country"));

        // Create Select class object
        Select select = new Select(dropdown);

        // Select by visible text
        select.selectByVisibleText("India");

        // Select by value
        select.selectByValue("IN");

        // Select by index
        select.selectByIndex(2);

        // Get selected option
        String selectedOption =
                select.getFirstSelectedOption().getText();

        System.out.println(selectedOption);

		
	}

}
