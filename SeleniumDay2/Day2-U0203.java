
package com.omrbranch.day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0203 {
	
public void t0203() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.traininginomr.co.in/contact/");
	driver.manage().window().maximize();
}	
public static void main(String[] args) {
	Day2_U0203 m = new Day2_U0203();
	m.t0203();
}


}