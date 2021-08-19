package com.sg.seleniumadvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthRobotTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		driver.get("http://Username:Password@softwaretesting.com/");
		driver.get("http://softwaretesting.com/");

		
		Robot rb=new Robot();
//		rb.keyPress(KeyEvent.VK_B);
//		rb.keyPress(KeyEvent.VK_B);
//		rb.keyPress(KeyEvent.VK_B);
		
		String name="hello";
		
		for(int i=0;i<name.length();i++)
		{
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(name.charAt(i)));
			Thread.sleep(500);
		}
		
		rb.keyPress(KeyEvent.VK_TAB);
		
		name="pass123";
		for(int i=0;i<name.length();i++)
		{
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(name.charAt(i)));
			Thread.sleep(500);
		}
		rb.keyPress(KeyEvent.VK_ENTER);
	}

}









