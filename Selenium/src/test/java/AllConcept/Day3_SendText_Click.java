package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_SendText_Click {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com/login");

        // Enter username
        driver.findElement(By.id("username"))
              .sendKeys("Dhanoj");

        // Enter password
        driver.findElement(By.id("password"))
              .sendKeys("admin123");

        // Click login button
        driver.findElement(By.id("loginBtn"))
              .click();
    }
}