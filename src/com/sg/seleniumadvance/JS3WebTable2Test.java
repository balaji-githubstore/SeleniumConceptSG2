package com.sg.seleniumadvance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS3WebTable2Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://datatables.net/examples/basic_init/scroll_y.html");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		int rowCount=driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
		
		
		js.executeScript("window.scrollBy(0,-100)");
		
		for(int i=1;i<=rowCount;i++)
		{
			
			js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")));
			String name=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name);
		}
		
		js.executeScript("window.scroll(0,600)");

		
		
		
		
	}

}
