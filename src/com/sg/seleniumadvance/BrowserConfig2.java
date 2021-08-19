package com.sg.seleniumadvance;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfig2 {

	public static void main(String[] args) {
		
		//ChromeOption
			
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "D:\\");
		
		ChromeOptions opt=new ChromeOptions();	
		opt.setExperimentalOption("prefs", prefs);

		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.malaysiaairlines.com/in/en.html");


	}

}
