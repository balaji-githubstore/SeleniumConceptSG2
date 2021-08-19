package com.sg.seleniumconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsSessionIdTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//img[@class='appClose']")).click();
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("-------------------------------");
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(windows.get(0));
		System.out.println(windows.get(1));

	}

}
