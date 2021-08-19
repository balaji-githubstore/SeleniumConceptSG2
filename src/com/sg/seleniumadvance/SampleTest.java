package com.sg.seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		
		if(driver.findElement(By.xpath("//div[@class='closeDlgIframe']")).isDisplayed())
		{
			
		}
		
		if(driver.findElement(By.xpath("//div[@class='Next']")).isEnabled())
		{
			driver.findElement(By.xpath("//div[@class='Next']")).click();
		}
	}

}







