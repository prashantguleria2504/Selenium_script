package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.KeysRelatedAction;

public class action_mouse_keyB {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		/*
		 * driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("batman");
		 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys("batman");
		 * driver.findElement(By.xpath("//input[@name='login']")).click();
		 */
		
		WebElement link = driver.findElement(By.linkText("Car Rentals"));
		Actions act = new Actions(driver);  // Action is an Event performed on class Actions
//		Action mouseover = act.moveToElement(link).build(); // build is compiler. 
//		mouseover.perform();  
		//OR
		
		act.moveToElement(link).build().perform();  // will do mouseover
		Thread.sleep(3000);
		link.click();
		//act.sendKeys(link, Keys.ENTER).build().perform();  // will click using keyboard
		Thread.sleep(3000);
		
		WebElement linkH = driver.findElement(By.linkText("Home"));
		Actions actH = new Actions(driver);
		actH.sendKeys(linkH, Keys.ENTER).build().perform();

		

	}

}
