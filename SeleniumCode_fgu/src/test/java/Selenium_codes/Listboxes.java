package Selenium_codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login.php/");
		
		driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Madhulika");
		driver.findElement(By.name("lastname")).sendKeys("Bhalerao");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));
		
		Select s1= new Select(day);
		s1.selectByValue("16");
		
		Select s2= new Select(month);
		s2.selectByVisibleText("Jan");
		
		Select s3= new Select(year);
		s3.selectByValue("1995");
		
		driver.findElement(By.name("reg_email__")).sendKeys("madhulika bhalerao@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("000111");
		
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
