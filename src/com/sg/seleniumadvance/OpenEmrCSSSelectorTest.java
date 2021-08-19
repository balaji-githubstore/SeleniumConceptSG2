package com.sg.seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenEmrCSSSelectorTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		driver.findElement(By.cssSelector("#authUser")).sendKeys("admin");
		driver.findElement(By.cssSelector("#clearPass")).sendKeys("pass");
		
		Select selectLang=new Select(driver.findElement(By.cssSelector("[name='languageChoice']")));
		selectLang.selectByVisibleText("English (Indian)");

		driver.findElement(By.cssSelector("[type='submit']")).click();
		

	}
}





