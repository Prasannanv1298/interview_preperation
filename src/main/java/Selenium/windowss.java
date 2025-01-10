package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowss {

	WebDriver  d;
	private void launch_browser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");
	}
	
	@Test
	public void get_window_size() {
		launch_browser();
		System.out.println("Window - size : "+d.manage().window().getSize());
		System.out.println("Window - heignt : "+d.manage().window().getSize().getHeight());
		System.out.println("Window - Width: "+d.manage().window().getSize().getWidth());
		Dimension size = new Dimension(300, 150);
		d.manage().window().setSize(size);
	
		
		System.out.println("Window position : "+d.manage().window().getPosition());
		System.out.println("Window position : "+d.manage().window().getPosition().getX());
		System.out.println("Window position : "+d.manage().window().getPosition().getY());
		System.out.println("Window position : "+d.manage().window().getPosition().moveBy(9, 9));
		Point position = new Point(30, 30);
		d.manage().window().setPosition(position);
		
		d.manage().window().minimize();
		d.manage().window().maximize();
		d.manage().window().minimize();
		d.manage().window().fullscreen();
		d.manage().window().minimize();
		d.quit();
		
		
	}

}
