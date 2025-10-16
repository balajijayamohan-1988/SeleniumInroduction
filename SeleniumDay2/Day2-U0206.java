package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0206 {

	public void t0206() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		//WebElement txtSearch = driver.findElement(By.id("APjFqb"));
		txtSearch.sendKeys("Greens Tech Chennai OMR Branch");
		
	}
	
public static void main(String[] args) {
	Day2_U0206 m = new Day2_U0206();
	m.t0206();
}
}
