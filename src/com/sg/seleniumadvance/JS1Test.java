package com.sg.seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS1Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//document.getElementById('authUser').value='john'
		js.executeScript("document.getElementById('authUser').value='john'");

		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
	}

}
