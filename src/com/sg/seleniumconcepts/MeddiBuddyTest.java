package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeddiBuddyTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.medibuddy.in/");

		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.linkText("Signup")).click();

		driver.findElement(By.id("mobile")).sendKeys("123");
		driver.findElement(By.id("name")).sendKeys("bala");
		driver.findElement(By.name("useremail")).sendKeys("bala@gmail.com");

		driver.findElement(By.xpath("//button[text()='Sign up']")).click();

//		WebElement ele= driver.findElement(By.id("signuperr"));
//		String actualText = ele.getText();
		
//		Thread.sleep(2000);

//		String actualText1 = driver.findElement(By.id("signuperr")).getText();
//		System.out.println(actualText1);
		
		String actualText= driver.findElement(By.xpath("//div[contains(text(),'INVALID')]")).getText();
		System.out.println(actualText);
		
	}

}





