package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8_KeyboardActions {

	public static void main(String args[])
	{
		
		
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        Actions act = new Actions(driver);

        WebElement input =
                driver.findElement(By.id("username"));



        // ================= Enter Text =================

        input.sendKeys("Dhanoj");



        // ================= Press ENTER =================

        input.sendKeys(Keys.ENTER);



        // ================= Press TAB =================

        input.sendKeys(Keys.TAB);

        
        
        // ================= BACKSPACE =================

        input.sendKeys(Keys.BACK_SPACE);



        // ================= DELETE =================

        input.sendKeys(Keys.DELETE);



        // ================= ARROW KEYS =================

        input.sendKeys(Keys.ARROW_LEFT);

        input.sendKeys(Keys.ARROW_RIGHT);

        input.sendKeys(Keys.ARROW_UP);

        input.sendKeys(Keys.ARROW_DOWN);
        
        
        
        
        
        
        


        // ================= CTRL + A =================

        act.keyDown(Keys.CONTROL)
           .sendKeys("a")
           .keyUp(Keys.CONTROL)
           .perform();



        // ================= CTRL + C =================

        act.keyDown(Keys.CONTROL)
           .sendKeys("c")
           .keyUp(Keys.CONTROL)
           .perform();



        // ================= CTRL + V =================

        act.keyDown(Keys.CONTROL)
           .sendKeys("v")
           .keyUp(Keys.CONTROL)
           .perform();





        driver.quit();
		
		
		
		
	}
}
