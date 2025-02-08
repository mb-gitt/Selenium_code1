package Selenium_codes;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class SS_2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/");
		Thread.sleep(5000);
		
		String Random= RandomString.make(2);
		
		File path= new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\pract1\\lenskart"+Random+".jpg");
	    File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, path);
		driver.quit();
	}

}
