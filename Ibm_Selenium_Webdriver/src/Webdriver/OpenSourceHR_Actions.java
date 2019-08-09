package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenSourceHR_Actions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");  // set Chrome driver properties.
		WebDriver driver = new ChromeDriver();   // webdriver is a interface which contains all the browser packages or implementation of all the browsers. This will open new instance of browser.
		
		driver.manage().window().maximize();   // maximise the window
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		// clicking directly
		
		//driver.findElement(By.name("Submit")).click();		
		
		// Clicking login using Actions
		
		
		 WebElement clickL = driver.findElement(By.name("Submit")); Actions actL = new
		 Actions(driver); actL.sendKeys(clickL, Keys.ENTER).build().perform();
		 
		 WebElement mouseover = driver.findElement(By.id("menu_pim_viewPimModule"));
		 Actions mousePIM = new Actions(driver);
		 mousePIM.moveToElement(mouseover).build().perform();
		 
		 driver.findElement(By.linkText("Employee List")).click();
		 
		 
	}

}
