package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://elearning.upskills.in/index.php");
		
		driver.findElement(By.name("login")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.name("submitAuth")).click();
		
		driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
		Thread.sleep(3000);
		// upload file. Selenium does not automate window bases applications. 
		// While clicking choose file button the page that comes up is BOOWSER RELATED PAGE can be automated by using "sendKeys<filepath>" or using 3rd party tool AUTOIT via which files can be uploaded.
		// Selenium failed to automate window bases applications.
		driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\PRASHANTGULERIA\\Desktop\\Data.xlsx");
		
		

	}

}
