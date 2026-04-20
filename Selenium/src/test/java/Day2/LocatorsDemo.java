package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	
	public static void main(String args[]){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//1. Name 
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys("Macbook");
		
		//2. id
		WebElement logo =driver.findElement(By.id("logo"));
		boolean status = logo.isDisplayed();
		System.out.println("logo displayed : " + status);
		
		//3. linkText & PartialLinkText
		driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("Tab")).click();
		
		//4. className
		List<WebElement>headerLinks = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total header links : " + headerLinks.size());
		
		//5.tagName
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Total links : "+ links.size());
		
		
		
		
		
	}

}
