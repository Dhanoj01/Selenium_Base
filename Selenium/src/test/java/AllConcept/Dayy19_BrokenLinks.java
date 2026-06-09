package AllConcept;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayy19_BrokenLinks {

	public static void main(String args[]) throws IOException
	{
		// Launch browser
        WebDriver driver = new ChromeDriver();

        // Open application URL
        driver.get("https://example.com");

        // Get all links present on the page
        List<WebElement> links =
                driver.findElements(By.tagName("a"));

        // Iterate through each link
        for (WebElement link : links) {

            // 1. Get href attribute value
            String url = link.getAttribute("href");

            // 2.Skip if href is null or empty
            if (url == null || url.isEmpty()) {
                continue;
            }

            // 3.Create URL object
            URL linkUrl = new URL(url);

            // 4.Open connection
            HttpURLConnection conn =
                    (HttpURLConnection) linkUrl.openConnection();

            // 5.Send HEAD request
            // HEAD fetches only response headers
            conn.setRequestMethod("HEAD");

            // 6.Establish connection
            conn.connect();

            // 7.Get HTTP response code
            int responseCode = conn.getResponseCode();

            // 8.Check whether link is broken
            if (responseCode >= 400) {

                System.out.println(
                        "Broken Link : "
                        + url
                        + " --> "
                        + responseCode);

            } else {

                System.out.println(
                        "Valid Link : "
                        + url
                        + " --> "
                        + responseCode);
            }
        }

        // Close browser
        driver.quit();
    
		
		
	}
}
