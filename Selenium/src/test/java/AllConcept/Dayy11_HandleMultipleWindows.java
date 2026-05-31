package AllConcept;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayy11_HandleMultipleWindows {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");



        // ================= Parent Window =================

        String parentWindow =
                driver.getWindowHandle();

        System.out.println(parentWindow);



     // Open new tab
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://youtube.com");



        // Open new window
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://facebook.com");
    


        // ================= Get All Windows =================

        Set<String> allWindows =
                driver.getWindowHandles();



        // ================= Switch Windows =================

        for(String window : allWindows)
        {
            driver.switchTo().window(window);
        }



        // ================= Close Child Window =================

        driver.close();



        // ================= Switch Back Parent =================

        driver.switchTo().window(parentWindow);



        driver.quit();
		
	}

}
