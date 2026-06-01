package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//with import
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Dayy14_RelativeLoatorInSelenium4 {

	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");



        WebElement username =
                driver.findElement(By.id("username"));



        // ================= Below =================

        WebElement password =
                driver.findElement(
                with(By.tagName("input"))
                .below(username));



        // ================= Above =================

        WebElement title =
                driver.findElement(
                with(By.tagName("h1"))
                .above(username));



        // ================= To Right Of =================

        WebElement email =
                driver.findElement(
                with(By.tagName("input"))
                .toRightOf(username));



        // ================= To Left Of =================

        WebElement label =
                driver.findElement(
                with(By.tagName("label"))
                .toLeftOf(username));



        // ================= Near =================

        WebElement button =
                driver.findElement(
                with(By.tagName("button"))
                .near(password));



        driver.quit();
	}
}


/*
 
Relative Locators work based on the visual position of elements on the page, not just their position in the HTML source code.

The five Selenium 4 relative locators are:

above()

below()

toLeftOf()

toRightOf()

near()

*/

