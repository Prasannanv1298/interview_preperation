package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		return driver;
	}


	public static void setDriver(WebDriver driver) {
		Browser.driver = driver;
	}


	public void launch_browser(String browser_name) {
		
		switch (browser_name.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			setDriver(new ChromeDriver());
			break;
		case "edge":	
            WebDriverManager.edgedriver().setup();
            setDriver(new EdgeDriver());
		default:
			break;
		}
	}
	
	
}
