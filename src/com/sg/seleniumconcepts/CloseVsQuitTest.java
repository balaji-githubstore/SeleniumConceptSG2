package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuitTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//img[@class='appClose']")).click();
		
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		
		
		System.out.println(driver.getTitle());
//		driver.quit(); // always recommeded 

	}

}
