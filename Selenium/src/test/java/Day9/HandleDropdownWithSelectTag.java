package Day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownWithSelectTag {

    public static void main(String args[]) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // Locate dropdown element
        WebElement drpCountryElement =
                driver.findElement(By.xpath("//select[@id='country']"));

        // Create Select class object
        Select drpCountry = new Select(drpCountryElement);

        // Selecting options from dropdown
        drpCountry.selectByVisibleText("Canada");
        drpCountry.selectByValue("uk");
        drpCountry.selectByIndex(3);

        // Find total options in dropdown
        List<WebElement> options = drpCountry.getOptions();

        System.out.println("Total number of options : " + options.size());

        // Print options using normal for loop
        for (int i = 0; i < options.size(); i++) {

            System.out.println(options.get(i).getText());
        }

        // Print options using enhanced for loop
        for (WebElement op : options) {

            System.out.println(op.getText());
        }

        driver.quit();
    }
}