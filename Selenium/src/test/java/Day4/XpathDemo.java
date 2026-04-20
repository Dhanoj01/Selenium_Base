package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");

		//Xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
		
		//Xpath with multiple attribute
		driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("Tshirts");

		//Xpath with 'and' 'or' ooperator
		driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("Tshirts");
		driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Tshirts");

		//Xpath with inner text
		driver.findElement(By.xpath("//*text() = 'Macbook']")).click();
		driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		
	    boolean status = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        System.out.println(status);
        
        //Xpath with contains
        //Search
        driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
        
        //Xpath with starts-with
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirts");
        
        //chained xpath
        boolean status1 = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println(status1);
        
        
        

        
        
        
		
		driver.close();
		
	}

}
