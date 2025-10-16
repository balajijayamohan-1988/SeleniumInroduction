package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0201 {

	public void t0201() {
		//browser launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		WebElement txtUserName =driver.findElement(By.id("email"));
		txtUserName.sendKeys("greenstechchennaiomr@gmail.com");
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		txtPassWord.sendKeys("Greens@123");
		
	}
public static void main(String[] args) {
	Day2_U0201 m = new Day2_U0201();
	m.t0201();
}	
	
}
