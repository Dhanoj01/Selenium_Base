package Day8;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {


	public static void main(String args[])
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();


		Set<String> windows = driver.getWindowHandles();


		for(String winid : windows)
		{
			String title = driver.switchTo().window(winid).getTitle();

			System.out.println("Title : " + title);

			if(title.equals("OrangeHRM") || title.equals("some Other title"))
			{
				driver.close();

			}
		}


	}

}
