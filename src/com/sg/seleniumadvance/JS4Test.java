package com.sg.seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS4Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://atozgrocery.in/my-account/");
		
		driver.findElement(By.id("reg_email")).sendKeys("king");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);

	   String tooltip=	js.executeScript("return document.querySelectorAll(\"#reg_email\")[0].validationMessage").toString();
	   System.out.println(tooltip);
	}
	
	

}










