package Selenium_codes;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listboxes1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.xpath("(//span[contains(text(),\"Decline optional cookies\")])[1]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Facebook\")]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Madhulika");
		driver.findElement(By.name("lastname")).sendKeys("Bhalerao");
		
		WebElement day= driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));

//to get the size of the data
		List<WebElement> day1= driver.findElements(By.xpath("(//select[@id=\"day\"]//option)"));
		int number= day1.size();
		System.out.println("no of days= "+number);
//to get all the data
		for(int i=0; i<day1.size(); i++) {
			String dayvalue= day1.get(i).getText();
			System.out.print(dayvalue);
//to get a particular no from the list
			if(dayvalue.equals("16")){
				day1.get(i).click();
			}}
	//	driver.findElement(By.xpath("(//span[contains(text(),\"Decline optional cookies\")])[1]")).click();
//to get the size of month data
			List<WebElement> m1=driver.findElements(By.xpath("(//select[@id=\"month\"]//option)"));
			int number1=m1.size();
			System.out.println("no of months= "+number1);
//to get all the data from month list
			for(int i=0; i<m1.size(); i++) {
				String monthvalue= m1.get(i).getText();
				System.out.println(monthvalue);
//to get a particular month from list
				if(monthvalue.equals("jan")) {
					m1.get(i).click();
				}}
			driver.findElement(By.xpath("(//span[contains(text(),\"Decline optional cookies\")])[1]")).click();
//to the the size
			List<WebElement> y1= driver.findElements(By.xpath(""));
			System.out.println("size of no of years= "+y1.size());
//all the data
			for(int i=0; i<y1.size(); i++) {
				String yearvalue= y1.get(i).getText();
				System.out.println(yearvalue);
//to get a particular year
				if(yearvalue.equals("1995")) {
					y1.get(i).click();
				}
			}
				
			
		driver.quit();
		
		
		

	}

}
