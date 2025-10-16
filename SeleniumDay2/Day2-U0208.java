package com.omrbranch.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0208 {
	public void t0208() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		
	}
public static void main(String[] args) {
	Day2_U0208 m = new Day2_U0208();
	m.t0208();
}	

}
