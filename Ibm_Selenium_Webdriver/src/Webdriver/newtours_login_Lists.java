package Webdriver;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newtours_login_Lists {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
		 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("batman");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("batman");
		 driver.findElement(By.xpath("//input[@name='login']")).click();
		 
		 WebElement rad = driver.findElement(By.xpath("//input[@type='radio' and @value='roundtrip']"));
		 if (rad.isSelected()) {
			 //System.out.println("Round trip is selected");
			 driver.findElement(By.xpath("//input[@type='radio' and @value='oneway']")).click();
			 System.out.println("one way is selected");
		 }
		 else {
			 System.out.println("Round trip not selected");
		 }
		 
		 WebElement pc = driver.findElement(By.name("passCount"));
		 Select sel = new Select(pc);
		 
		 // LIST is used to fetch all the options from drop down
		 List<WebElement> DD = sel.getOptions();  // getOption will pull all the options from the drop down
		 
		 System.out.println("Total options available are "+" "+DD.size());  //printing the number of options available in drop down
		 
		 for (int i=0; i<=DD.size();i++) {   // loop to print the available options. SIZE returns the number of value in the list. SIZE is not a method of Sel. its of Java.
			 System.out.println(DD.get(i).getText());
		 }
	
		 
		 //1st option using select by visible text (what is visible in drop down)
		 sel.selectByVisibleText("2");  //2
		 
		 Thread.sleep(3000);
		 //2nd option by INDEX (index starts from 0,1,2 etc)
		 sel.selectByIndex(3);  //4
		 Thread.sleep(3000);
		 
		 // 3rd option
		 sel.selectByValue("1");  //1
		 
		 WebElement country = driver.findElement(By.xpath("//select[@name='fromPort']"));
		 Select c1 = new Select(country);
		 
		List<WebElement> cty = c1.getOptions();
		System.out.println("Total countries are "+" "+cty.size());
		for (int a = 0; a<=cty.size();a++) {
			System.out.println(cty.get(a).getText());
				
		}
		
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		 
		 
		 
		 
		 
		 
		 

	}

}
