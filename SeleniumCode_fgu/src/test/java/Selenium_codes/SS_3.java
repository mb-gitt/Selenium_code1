package Selenium_codes;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class SS_3 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/");

		WebElement ele= driver.findElement(By.xpath("//a[contains(text(),\"Kids Glasses\")]"));
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(5000);
		WebElement ele1= driver.findElement(By.xpath("//span[contains(text(),\"Full Rim\")]"));
		Thread.sleep(20000);
		ele1.click();
		Thread.sleep(5000);
		
		String random= RandomString.make(2);
		
		File path= new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\pract1\\lenskart-3"+random+".jpg");
		File path1= new File("C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\SCREENSHOT\\lenskart-4"+random+".jpg");
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, path1);
		FileHandler.copy(source, path);
		driver.quit();
	}
}
