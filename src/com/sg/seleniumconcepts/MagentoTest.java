package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //runtime polymorphism //cross browser testing
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/"); //wait until the page load happens - no time limit
		
		WebElement ele = driver.findElement(By.id("gnav_557"));//present
		ele.click();  //and visible -- takes only 500ms
		
		driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("balaji0017@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("balaji@12345");
	
		driver.findElement(By.id("send2")).click();
		
		//wait condition to make sure dashboard is loaded
		//class ---> WebDriverWait
		//non-static method --> until
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));
		
		//get title and print 
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		
		//get the id and print
		String actualId=driver.findElement(By.xpath("//span[contains(text(),'ID')]")).getText();
		System.out.println(actualId);
		//click on logout
		driver.findElement(By.linkText("Log Out")).click();
		
		
		
	}
}
