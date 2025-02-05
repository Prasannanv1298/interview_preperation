package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.BuildInfo;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Optionss {

	WebDriver  d;
	String parent;
	String child;

	@BeforeMethod
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");

		parent = d.getWindowHandle();
		
	}

	//	@AfterMethod
	//	public void quitt() {
	//		d.quit();
	//	}

	@Test(enabled = false)
	public void new_window() {
		d.switchTo().newWindow(WindowType.WINDOW);
		d.get("https://reqres.in/");
        child=d.getWindowHandle();

		Set<String> wind=	d.getWindowHandles();
		for(String h : wind) {
			System.err.println(h);
		}

		d.close();
		d.switchTo().window(parent);
		
		System.err.println( "child  "+d.getWindowHandle());;
		
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=4626293310768208539&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9208027&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		d.close();
//		child.equals(d.getWindowHandle());
	}
	
	
	@Test
	public void build_info() {
			BuildInfo buildInfo = new BuildInfo();
	
	        System.out.println("Selenium Version: " + buildInfo.getReleaseLabel());
	        System.out.println("Build Revision: " + buildInfo.getBuildRevision());
		}

	public void timeoutss() {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		d.manage().timeouts().scriptTimeout(Duration.ofSeconds(6));

		Duration ds= d.manage().timeouts().getPageLoadTimeout();
		System.out.println("Page load time out"+ds);

		Duration time= d.manage().timeouts().getImplicitWaitTimeout();
		System.out.println("Implisit time out"+time);

		Duration st =d.manage().timeouts().getScriptTimeout();
		System.out.println("Script time out"+st);

	}

	@Test(enabled = false)
	public void cookiee() {
		Set<Cookie>	c=d.manage().getCookies();
		for(Cookie h : c) {
			System.err.println("Namr : "+h.getName());
			System.out.println("Path : "+h.getPath());
			System.out.println("Domain : "+h.getDomain());
			System.out.println("Value : "+h.getValue());
			System.out.println("Is Http only : "+h.isHttpOnly());
			System.out.println("Expiry : "+h.getExpiry());
			System.out.println("Is Secure : "+h.isSecure());
		}


		Set<Cookie> cookies = d.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}

		Cookie cookie = d.manage().getCookieNamed("session_id");
		System.out.println("Session ID: " + cookie.getValue());

		Cookie newCookie = new Cookie("testCookie", "12345");
		d.manage().addCookie(newCookie);

		d.manage().deleteCookieNamed("testCookie");

		d.manage().deleteAllCookies();


	}


	public void navic() {
		d.navigate().back();

		d.navigate().forward();

		d.navigate().refresh();

		d.navigate().to("URL");
	}


	public void switc_to() {
		d.switchTo().frame(0);
		d.switchTo().frame("frme name");
		d.switchTo().frame("web element");
		d.switchTo().parentFrame();
		d.switchTo().defaultContent();


		d.switchTo().alert();

		d.switchTo().activeElement();
		d.switchTo().window("parent");
		d.switchTo().newWindow(WindowType.WINDOW);
	}
}
