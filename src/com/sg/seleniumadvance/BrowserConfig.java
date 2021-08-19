package com.sg.seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfig {

	public static void main(String[] args) {
		
		//ChromeOption
		
		ChromeOptions opt=new ChromeOptions();
//		opt.setAcceptInsecureCerts(true);  //
//		opt.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.malaysiaairlines.com/in/en.html");


	}

}
