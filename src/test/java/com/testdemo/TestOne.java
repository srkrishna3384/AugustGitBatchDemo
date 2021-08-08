package com.testdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne {
	public static void demoOne() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rameshsoft.com");
		System.out.println("user navigated to Rameshsoft home page");
		System.out.println("Person2 changes....");
	}
}
