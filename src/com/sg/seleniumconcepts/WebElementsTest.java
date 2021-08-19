package com.sg.seleniumconcepts;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		
		List<WebElement> elements= driver.findElements(By.tagName("a"));
		int linkCount=elements.size();
		
		System.out.println(linkCount);
		
		for(int i=0;i<linkCount;i++)
		{
			String link = elements.get(i).getAttribute("href");
			System.out.println(link);
			
			String text=elements.get(i).getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase("images"))
			{
				elements.get(i).click();
				break;
			}
		}
		

		//create foreach and try to do same operation
		
//		for(int i=0;i<linkCount;i++)
//		{
//			WebElement ele = elements.get(i);
//			String link = ele.getAttribute("href");
//			System.out.println(link);
//			String text=ele.getText();
//			System.out.println(text);
//		}
		
		
		
//		WebElement ele = elements.get(24);
//		String link = ele.getAttribute("href");
//		System.out.println(link);
//		String text=ele.getText();
//		System.out.println(text);

	}

}



