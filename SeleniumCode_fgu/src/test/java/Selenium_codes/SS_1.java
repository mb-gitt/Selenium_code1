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

public class SS_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.jiocinema.com/");
		Thread.sleep(5000);
		File f1=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screenshot\\pract1\\jio-2.jpg");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, f1);
		driver.quit();
	}

}
