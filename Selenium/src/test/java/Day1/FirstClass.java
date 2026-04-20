package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {


	public static void main(String args[])
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://nopcommerce.com/");
        
        String actualTitle = driver.getTitle();
        String expectedTitle = "Free and open-source eCommerce platform. ASP.NET Core based shopping cart. - nopCommerce";
        
        System.out.println("Actual Title - "+actualTitle);
        System.out.println("Expected Title - "+expectedTitle);
        
        
        if(actualTitle.equals(expectedTitle))
        {
        	System.out.println("Title is correct !");
        }
        
        else
        {
        	System.out.println("Title is incorrect");
        }
        
        
        driver.close();

	}
}
