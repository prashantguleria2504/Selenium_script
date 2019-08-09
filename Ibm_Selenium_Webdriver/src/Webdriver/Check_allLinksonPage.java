package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_allLinksonPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
		
		/*
		 * driver.findElement(By.linkText("Car Rentals")).click(); Thread.sleep(3000);
		 * String title = driver.getTitle(); System.out.println(title);
		 */
		
		String underConst = "Under Construction: Mercury Tours";
		List<WebElement> link = driver.findElements(By.tagName("a"));  // stored all available links into element link
		String[] linktext = new String[link.size()];   // getting the size of the available links.
		
		// Loop to extract the link text of each link element.
		
		int i=0;
		for (WebElement e:link)  {
			linktext[i]=e.getText();
			i++;
		}
		// test whether each link is working or not
		
		for (String t:linktext) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals(underConst)) {
				System.out.println(t+" "+"is underconstruction");
			}
			else {
				System.out.println(t+" "+ "is working");
			}
			driver.navigate().back();
		}

	}

}
