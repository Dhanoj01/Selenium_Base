package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayy10_SwitchToFrame {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");



        // ================= Switch by Index =================

        driver.switchTo().frame(0);

        driver.findElement(By.id("username"))
              .sendKeys("kunal_singh");



        // ================= Back to Main Page =================

        driver.switchTo().defaultContent();



        // ================= Switch by Name or ID =================

        driver.switchTo().frame("loginFrame");

        driver.findElement(By.id("password"))
              .sendKeys("admin123");



        // ================= Back to Main Page =================

        driver.switchTo().defaultContent();



        // ================= Switch by WebElement =================

        WebElement frameElement =
                driver.findElement(By.xpath("//iframe"));

        driver.switchTo().frame(frameElement);

        driver.findElement(By.id("loginBtn"))
              .click();



        // ================= Parent Frame =================

        driver.switchTo().parentFrame();



        driver.quit();
	}
}
