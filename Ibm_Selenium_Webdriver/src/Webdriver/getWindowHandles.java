package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");  // set Chrome driver properties.
		WebDriver driver = new ChromeDriver();   // webdriver is a interface which contains all the browser packages or implementation of all the browsers. This will open new instance of browser.
		
		driver.manage().window().maximize();   // maximise the window
		driver.get("http://retail.upskills.in/admin/");
		
		driver.findElement(By.id("input-username")).sendKeys("Admin");  //admin
		driver.findElement(By.id("input-password")).sendKeys("adminuser@12345");  //admin@123
		driver.findElement(By.xpath("//*[@class='btn btn-primary' and @type='submit']")).click();
		
		//getWhindowHandel : when u want to work with active parent tab / window.
		//getWindowHandels: when u want to work both with parent & child tab / windows.

	}

}
