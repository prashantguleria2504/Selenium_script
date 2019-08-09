package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");  // set Chrome driver properties.
		WebDriver driver = new ChromeDriver();   // webdriver is a interface which contains all the browser packages or implementation of all the browsers. This will open new instance of browser.
		//ChromeDriver driver = new ChromeDriver();  // This will also open the chrome browser.
		
		driver.manage().window().maximize();   // maximise the window
		driver.get("https://opensource-demo.orangehrmlive.com/");   // opens Website
		
		//System.out.println(driver.getTitle());  // will print the title of the page.
	/*	
		String expectedResult = driver.getTitle();   //will print the title of the page.
		System.out.println(expectedResult);
	*/	
		
		String expectedResult ="OrangeHRM";
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String actualTitle = driver.getTitle();
		if(expectedResult == actualTitle) {
			
			System.out.println("Result MATCHES !!!");
		}
		else {
			System.out.println("No Match!!!");
		}
		
		driver.close();  // will close the ACTIVE browser.
		driver.quit();  // If multiple browsers are open then this will close all the open browsers.
		
		// driver.close() / driver.quite(): does not have return types and does not accept arguments.
		 


	}

}
