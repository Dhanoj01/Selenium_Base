package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//<input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
		
		//tag id  tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");        same
		
		//tag class tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");

		
		//tag attribute  tag[attribute="value"]
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
       //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");

		
		
		//tag class attribute  tag.class[attribute="value"]
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-shirts");

		
	}
}
