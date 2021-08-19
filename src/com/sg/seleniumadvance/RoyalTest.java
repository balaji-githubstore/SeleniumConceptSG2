package com.sg.seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//b1
public class RoyalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.royalcaribbean.com/account/create");
		
		
		if(driver.findElements(By.xpath("//*[@class='email-capture__close']")).size()>0) {
			driver.findElement(By.xpath("//*[@class='email-capture__close']")).click();
		}
		
		
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("hello");
		
		driver.findElement(By.xpath("//span[text()='Month']")).click();
//		Thread.sleep(1000);
		String month="April";
		System.out.println("//span[contains(text(),'"+month+"')]");
		
		
		driver.findElement(By.xpath("//span[contains(text(),'"+month+"')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'November')]")).click();
		
		//span[text()=' February ']
		
		
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Country/Region of residence')]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'India')])[2]")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']/..")).click();
	}

}
