package com.omrbranch.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0205 {

	public void t0205() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
	
	}
public static void main(String[] args) {
	Day2_U0205 m = new Day2_U0205();
	m.t0205();
}
}