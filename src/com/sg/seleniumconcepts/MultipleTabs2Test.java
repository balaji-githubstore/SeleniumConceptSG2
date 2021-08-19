package com.sg.seleniumconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs2Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		
//		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		Set<String> windows=driver.getWindowHandles();
		
		for(String win : windows)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals("Genpact"))
			{
				break;
			}
			System.out.println("------------------");
		}
		
		//findelement on genpact
		driver.close();

	}

}
