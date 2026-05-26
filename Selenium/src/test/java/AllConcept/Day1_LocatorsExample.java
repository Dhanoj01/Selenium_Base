package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_LocatorsExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        // By ID
        WebElement element1 = driver.findElement(By.id("username"));

        // By Name
        WebElement element2 = driver.findElement(By.name("password"));

        // By Class Name
        WebElement element3 = driver.findElement(By.className("login"));

        // By Tag Name
        WebElement element4 = driver.findElement(By.tagName("input"));

        // By Link Text
        WebElement element5 = driver.findElement(By.linkText("Login"));

        // By Partial Link Text
        WebElement element6 = driver.findElement(By.partialLinkText("Log"));

        // By CSS Selector
        WebElement element7 = driver.findElement(By.cssSelector("input[type='text']"));

        // By XPath
        WebElement element8 = driver.findElement(By.xpath("//input[@id='username']"));
    }
}