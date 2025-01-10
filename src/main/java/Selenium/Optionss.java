package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Optionss {

	WebDriver  d;
	private void launch_browser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");
	}
	
	
	
}
