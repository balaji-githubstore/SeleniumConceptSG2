package com.sg.seleniumadvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthAutoITTest2 {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		
		File file=new File("files/sg2.exe");
		
		String absPath= file.getAbsolutePath();
		System.out.println(absPath);
		
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		driver.get("http://Username:Password@softwaretesting.com/");
		driver.get("http://softwaretesting.com/");

//		Runtime.getRuntime().exec("D:\\B-Mine\\Company\\Company\\Scientific Games2\\java_selenium_workspace\\SeleniumConcept\\files\\sg2.exe");
	
		Runtime.getRuntime().exec(absPath);
	}

}









