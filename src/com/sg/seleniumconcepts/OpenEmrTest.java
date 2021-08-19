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

public class OpenEmrTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select selectLang=new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText("English (Indian)");
		
//		new Select(driver.findElement(By.name("languageChoice"))).selectByVisibleText("English (Indian)");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Flow Board']")));
		
		System.out.println(driver.getTitle());
		
		
		//mouse over on billy smith //span[@data-bind='text:fname']
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@data-bind='text:fname']"))).perform();
		
		
		//logout
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
	}
}





