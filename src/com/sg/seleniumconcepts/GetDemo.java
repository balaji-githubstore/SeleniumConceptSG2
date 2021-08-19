package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		String text= driver.findElement(By.partialLinkText("Acknowledgments")).getText();
		System.out.println(text);
		
		String tagname=driver.findElement(By.partialLinkText("Acknowledgments")).getTagName();
		System.out.println(tagname);
		
		String href=driver.findElement(By.partialLinkText("Acknowledgments")).getAttribute("href");
		System.out.println(href);
		
		String placholderUser=driver.findElement(By.id("authUser")).getAttribute("placeholder");
		System.out.println(placholderUser);
	}
}





