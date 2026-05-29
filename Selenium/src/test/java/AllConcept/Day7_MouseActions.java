package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_MouseActions {

	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        // Create Actions class object
        Actions act = new Actions(driver);



        // ================= Mouse Hover =================

        WebElement menu =
                driver.findElement(By.id("menu"));

        act.moveToElement(menu).perform();



        // ================= Double Click =================

        WebElement doubleClickBtn =
                driver.findElement(By.id("doubleClick"));

        act.doubleClick(doubleClickBtn).perform();



        // ================= Right Click =================

        WebElement rightClickBtn =
                driver.findElement(By.id("rightClick"));

        act.contextClick(rightClickBtn).perform();



        // ================= Drag and Drop =================

        WebElement source =
                driver.findElement(By.id("drag"));

        WebElement target =
                driver.findElement(By.id("drop"));

        act.dragAndDrop(source, target).perform();



        // ================= Click and Hold =================

        WebElement hold =
                driver.findElement(By.id("hold"));

        act.clickAndHold(hold).perform();



        // ================= Release =================

        act.release().perform();



        driver.quit();
	}
}
