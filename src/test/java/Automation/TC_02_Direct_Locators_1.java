package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import java.util.List;
//import java.util.concurrent.TimeUnit;

public class TC_02_Direct_Locators_1 {
	// ✅ Declare the logger at class level
	//private static final Logger logger = LoggerFactory.getLogger(TC_02_Direct_Locators_1.class);
	@Test
	public void testMethod() throws InterruptedException {
		// TODO Auto-generated method stub
		
		/* Direct Locators
		 * id , name, Linktext , PartialLinktext, Class Name, TagName
		 * 
		 * Customized Locators 
		 * 
		 * CSS Selector
		 * Tag and ID
		 * Tag and Class
		 * Tag and Attribute
		 * Tag, Class and Attribute 
		 * 
		 * XPath
		 * Absolute Xpath
		 * Relative Xpath
		 * 
		 * 1) Total number of links & print them
		 * 2) Total number of images
		 * 3) Click on any product link using linkText/partialLinkText
		 * https://demoblaze.com/index.html
		 */
		
		//ChromeDriver driver = new ChromeDriver();
				WebDriver driver = new ChromeDriver();
				driver.get("https://demoblaze.com");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				//System.out.println(driver.getTitle().equals("Your Store"));
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println("Total Number of links : " + links.size());
				List<WebElement> Imgs = driver.findElements(By.tagName("img"));
				System.out.println("Total Number of Images : " + Imgs.size());
				
				for(WebElement link: links )
				{
					System.out.println(link.getText());
					
					if(link.getText().equals("Phones"))
					{
						link.click();
						TimeUnit.SECONDS.sleep(5);
						
					}
					if(link.getText().equals("Laptops"))
					{
						link.click();
						TimeUnit.SECONDS.sleep(5);
						
					}
					if(link.getText().equals("Monitors"))
					{
						link.click();
						TimeUnit.SECONDS.sleep(5);
						
					}
					
					
				}
				
				System.out.println(driver.getTitle());
				driver.findElement(By.linkText("Apple monitor 24")).click();
				TimeUnit.SECONDS.sleep(5);
				System.out.println(driver.getTitle());
				//logger.info("This is an INFO log");
				//driver.close();
				driver.quit();

	}

}
