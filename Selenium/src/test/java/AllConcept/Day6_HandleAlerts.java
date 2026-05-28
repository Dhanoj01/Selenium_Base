package AllConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_HandleAlerts {

	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");



        // ================= SIMPLE ALERT =================

        driver.findElement(By.id("simpleAlert")).click();

        Alert alert1 = driver.switchTo().alert();

        alert1.accept();



        // ============== CONFIRMATION ALERT ==============

        driver.findElement(By.id("confirmAlert")).click();

        Alert alert2 = driver.switchTo().alert();

        //alert2.accept();
        alert2.dismiss();



        // ================= PROMPT ALERT =================

        driver.findElement(By.id("promptAlert")).click();

        Alert alert3 = driver.switchTo().alert();
     
        alert3.sendKeys("Dhanoj");
        alert3.accept();



        driver.quit();
	    
		
	}
}
