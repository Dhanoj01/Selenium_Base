package Day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        // Select specific checkbox
        driver.findElement(By.xpath("//input[@id='monday']")).click();

        // Total number of checkboxes
        List<WebElement> TotalCheckBox = driver.findElements(
        By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println("Total number of Checkboxes : " + TotalCheckBox.size());

        // Select all checkboxes
        for (WebElement chk : TotalCheckBox) {
            chk.click();
        }

        // Select last 2 checkboxes
        // Total - required = starting index
        // 7 - 2 = 5

        for (int i = TotalCheckBox.size() - 2; i < TotalCheckBox.size(); i++) {
            TotalCheckBox.get(i).click();
        }

        // Select first 2 checkboxes
        for (int i = 0; i < 2; i++) {
            TotalCheckBox.get(i).click();
        }

        // Uncheck selected checkboxes
        for (WebElement check : TotalCheckBox) {

            if (check.isSelected()) {
                check.click();
            }
        }

        driver.quit();
    }
}