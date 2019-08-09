package Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_innewtab_ROBOT {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		// opening Gmail in new tab just by entering one line code
		
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));  // keys.chord is used when we need to use multiple keys from keyboards.
		
		// move from google tab to gmail tab
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		
		String title2 = driver.getTitle();
		System.out.println("title 2 is "+" "+title2);
		
		/*
		 * robot.keyRelease(KeyEvent.VK_CONTROL); // will move from google tab to gmail
		 * tab robot.keyRelease(KeyEvent.VK_TAB);
		 */
		
		//getWhindowHandel : when u want to work with active parent tab / window.
		//getWindowHandels: when u want to work both with parent & child tab / windows.
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles()); // getWindowHandles will tell how many TABs are there in a browser.
		System.out.println(tabs.size());   // will print how many tabs are there in the browser.
		driver.switchTo().window(tabs.get(1));  // will move from one tab to another
		// SwitchTo() is a cmd to switch between tabs / browser
		
		driver.switchTo().window(tabs.get(0));  // will switch back to google window.
		
		
		if (title1 == title2) {   // compares the title.
			System.out.println("title matches!!");
			
		}
		else {
			System.out.println("title mismatch!!");
		}
		
	

	}

}
