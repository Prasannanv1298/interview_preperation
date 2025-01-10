package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drivers {

	
	
	@Test
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://in.indeed.com/");
	}
}
