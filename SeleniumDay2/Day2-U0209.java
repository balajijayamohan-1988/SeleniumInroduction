package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0209 {

	public void t0209() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.id("inputValEnter"));
		txtSearch.sendKeys("Books");
		
	}
public static void main(String[] args) {
	Day2_U0209 m = new Day2_U0209();
	m.t0209();
}	
}
