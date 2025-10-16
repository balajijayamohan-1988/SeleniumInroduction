package com.omrbranch.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0204 {

	public void t0204() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("velmurugansirgtomr");
		WebElement txtPassword =driver.findElement(By.name("password"));
		txtPassword.sendKeys("Greens@123");
		}
public static void main(String[] args) {
	Day2_U0204 m = new Day2_U0204();
	m.t0204();
	
}
}