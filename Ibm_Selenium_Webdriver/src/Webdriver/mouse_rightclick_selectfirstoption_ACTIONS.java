package Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_rightclick_selectfirstoption_ACTIONS {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");  // set Chrome driver properties.
		WebDriver driver = new ChromeDriver();   // webdriver is a interface which contains all the browser packages or implementation of all the browsers. This will open new instance of browser.
		
		driver.manage().window().maximize();   // maximise the window
		driver.get("http://realestate.upskills.in/admin/");
		
		driver.findElement(By.id("user_login")).sendKeys("Admin"); 
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345"); 
		driver.findElement(By.xpath("//*[@class='button border margin-top-10' and @type='submit']")).click();
		
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act = new Actions(driver);
		//right click using mouse
		act.contextClick(link).build().perform();
		
		// choose first option and click enter. For windows action we use ROBOTIC framework.
		
		Robot robot = new Robot();  //import AWT. .and wherever we select AWT need to use throw exceptions.
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		// Move from one tab to another using ROBOTS
		
		Robot tabmove = new Robot();
		tabmove.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		tabmove.keyPress(KeyEvent.VK_TAB);
		
		tabmove.keyRelease(KeyEvent.VK_CONTROL);
		tabmove.keyRelease(KeyEvent.VK_TAB);
		
		
		

	}

}
