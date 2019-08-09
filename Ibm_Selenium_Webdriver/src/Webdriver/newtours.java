package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtours {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
		WebElement UN = driver.findElement(By.xpath("//input[@name='userName']"));
		if (UN.isEnabled()) {
			UN.sendKeys("batman");
			Thread.sleep(3000);
			UN.clear();  // will clear the entered text.
			UN.sendKeys("batman");
		}
		
		if (driver.findElement(By.xpath("//input[@name='userName']")).isDisplayed()) {
			//UN.getAttribute("Value");  // if the value is changing then we use getattribute() to fetch the changed value.
			//System.out.println(UN.getAttribute("Value"));
			String name = UN.getAttribute("value");  // this will pull the value entered in the text box.
			System.out.println("Entered value is"+" "+name);
			
			String n1 = UN.getAttribute("name");  // this will give the attribute of the field name = username that we see while getting xpath.
			System.out.println("Attribute value is "+" "+n1);
			
			// get text can be used for labels or for dropdowns.
			String label1 = driver.findElement(By.xpath("//*[contains(text(),'User')]")).getText();  // xpath using contains
			System.out.println("get text value is "+" "+label1);
			
			System.out.println(driver.findElement(By.xpath("//*[text()='Destinations']")).getText());  // xpath using text()
		}
		
		
		
		/*
		 * else { System.out.println("UN not enabled"); }
		 * 
		 * 
		 * driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("batman");
		 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys("batman");
		 * driver.findElement(By.xpath("//input[@name='login']")).click();
		 */
		
		

	}

}
