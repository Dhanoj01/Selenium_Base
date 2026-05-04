package Day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("");
		
		
		driver.findElement(By.xpath("")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		//------------------------------------Approach 1 :-----------------------------------
		List<String> windowList = new ArrayList(windowIDs);
		
		String partentID = windowList.get(0);
		String childID =windowList.get(1);
		
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println("window title : "+driver.getTitle());
		
		
		//switch to parent window
		driver.switchTo().window(partentID);
		System.out.println("window title : "+ driver.getTitle());
		
		
		
		//----------------------------------Approach 2 : ------------------------------------
		
		for(String win : windowIDs)
		{
			String title = driver.switchTo().window(win).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
		
	}

}
