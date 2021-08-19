package com.sg.seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS2Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
	
		WebElement ele1= driver.findElement(By.id("authUser"));
		js.executeScript("arguments[0].value='admin';",ele1);
		
		driver.findElement(By.cssSelector("#clearPass")).sendKeys("pass");

		WebElement ele2= driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()",ele2);
		
		WebElement logoutEle=driver.findElement(By.xpath("//li[text()='Logout']"));
		js.executeScript("arguments[0].click()",logoutEle);
	}

}





