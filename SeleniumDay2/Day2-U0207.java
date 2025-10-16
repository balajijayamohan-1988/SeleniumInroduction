package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0207 {

	public void t0207() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
		//WebElement btnClick = driver.findElement(By.xpath("(//button[@class='cookie-close-icon'])[1]"));
		//btnClick.click();
		//btnClick.sendKeys(Keys.ENTER);
		WebElement txtSearch = driver.findElement(By.xpath("//div[contains(@class,'input-content')]"));
		txtSearch.sendKeys("keys.ENTER");
		
		
		
		
	}

	public static void main(String[] args) {
	Day2_U0207 m = new Day2_U0207();
	m.t0207();
}
}
