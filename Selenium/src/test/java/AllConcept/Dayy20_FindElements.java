package AllConcept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayy20_FindElements {
	
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");



        // ================= Get All Links =================

        List<WebElement> links =
                driver.findElements(By.tagName("a"));



        // ================= Count Links =================

        System.out.println("Total Links : "
                + links.size());



        // ================= Print Link Text =================

        for(WebElement link : links)
        {
            System.out.println(link.getText());
        }



        driver.quit();
    }

}
