package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");  // set Chrome driver properties.
		WebDriver driver = new ChromeDriver();   // webdriver is a interface which contains all the browser packages or implementation of all the browsers. This will open new instance of browser.
		//ChromeDriver driver = new ChromeDriver();  // This will also open the chrome browser.
		
		driver.manage().window().maximize();   // maximise the window
		driver.get("https://opensource-demo.orangehrmlive.com/");   // opens Website
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Performance")).click();
		
		// Listing all the available links present on the page. All links have tagName = a
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i=0; i<=links.size();i++) {
			System.out.println(links.get(i).getAttribute("href")); // href is attribute for all links.
		}
	
	/*	
		for (WebElement e:links) {  /// loop to print all the links in consol.
			String text =e.getText();
			System.out.println(text);
		}
	*/	

	}

}
