package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayy12_JavaScriptExecutor {
	
	public static void main(String args[])
	{
		 WebDriver driver = new ChromeDriver();

	        driver.get("https://example.com");



	        // ================= Create JS Executor =================

	        JavascriptExecutor js =
	                (JavascriptExecutor) driver;



	        // ================= Scroll Down =================

	        js.executeScript("window.scrollBy(0,500)");



	        // ================= Scroll Up =================

	        js.executeScript("window.scrollBy(0,-500)");



	        // ================= Scroll Till Element =================

	        WebElement element =
	                driver.findElement(By.id("loginBtn"));

	        js.executeScript(
	                "arguments[0].scrollIntoView();",
	                element);



	        // ================= Click Using JavaScript =================

	        js.executeScript(
	                "arguments[0].click();",
	                element);



	        // ================= Enter Text Using JavaScript =================

	        WebElement input =
	                driver.findElement(By.id("username"));

	        js.executeScript(
	                "arguments[0].value='Dhanoj';",
	                input);



	        // ================= Get Page Title =================

	        String title =
	                js.executeScript(
	                "return document.title;").toString();

	        System.out.println(title);



	        driver.quit();
		
	}

}
