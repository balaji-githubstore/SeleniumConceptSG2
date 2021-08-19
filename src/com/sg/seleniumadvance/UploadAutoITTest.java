package com.sg.seleniumadvance;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAutoITTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("wdgt-file-upload")).click();
		
		
		
		String absPath= new File("files/sg2upload.exe").getAbsolutePath();
		System.out.println(absPath);
		
		Runtime.getRuntime().exec(absPath);
	}

}
