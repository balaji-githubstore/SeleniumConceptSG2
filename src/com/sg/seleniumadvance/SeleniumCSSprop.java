package com.sg.seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class SeleniumCSSprop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://account.magento.com/customer/account/login");
		
		String befcolor=driver.findElement(By.id("magento-identity-ui-btn")).getCssValue("background-color");
		System.out.println(befcolor);
		
//		befcolor=driver.findElement(By.id("magento-identity-ui-btn")).getCssValue("color");
//		System.out.println(befcolor);
		
		befcolor=driver.findElement(By.id("magento-identity-ui-btn")).getCssValue("font");
		System.out.println(befcolor);
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("magento-identity-ui-btn"))).perform();
		
		befcolor=driver.findElement(By.id("magento-identity-ui-btn")).getCssValue("background-color");
		System.out.println(befcolor);
		
//		befcolor=driver.findElement(By.id("magento-identity-ui-btn")).getCssValue("color");
//		System.out.println(befcolor);
		
//		befcolor=driver.findElement(By.id("magento-identity-ui-btn")).getCssValue("font");
//		System.out.println(befcolor);
		
		String hex = Color.fromString(befcolor).asHex();
		
		System.out.println(hex);
	}

}
