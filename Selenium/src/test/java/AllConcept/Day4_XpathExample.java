package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_XpathExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        // Basic XPath
        driver.findElement(By.xpath("//input[@id='username']"));

        // XPath using contains()
        driver.findElement(By.xpath("//input[contains(@id,'user')]"));

        // XPath using text()
        driver.findElement(By.xpath("//button[text()='Login']"));

        // XPath using starts-with()
        driver.findElement(By.xpath("//input[starts-with(@id,'user')]"));

        // Parent Child XPath
        driver.findElement(By.xpath("//div[@class='form']//input"));

        // Following XPath
        driver.findElement(By.xpath("//label[text()='Email']/following::input[1]"));
    }
}