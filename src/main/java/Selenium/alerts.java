package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	WebDriver  d;
	private void launch_browser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/alerts");
	}

	

	@Test(enabled = false,description = "Alert method - accept")
	public void accepts() {
		launch_browser();
		WebElement click = this.d.findElement(By.xpath("//button[@id='alertButton']"));

		WebDriverWait ww = new WebDriverWait(d, Duration.ofSeconds(30));
		ww.until(ExpectedConditions.elementToBeClickable(click));

		JavascriptExecutor js =  (JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", click);

		Alert alr = d.switchTo().alert();
		System.out.println(alr.getText());
		alr.accept();
		d.quit();
	}


	@Test(enabled = false, description = "Alert method - alert will display after 5 sec")
	public void accepts_5sec() throws InterruptedException {
		launch_browser();
		WebElement click = this.d.findElement(By.xpath("//button[@id='timerAlertButton']"));

		WebDriverWait ww = new WebDriverWait(d, Duration.ofSeconds(30));
		ww.until(ExpectedConditions.elementToBeClickable(click));

		JavascriptExecutor js =  (JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", click);
		Thread.sleep(5000);
		Alert alr = d.switchTo().alert();
		System.out.println(alr.getText());
		alr.accept();
		d.quit();
	}
	
	@Test(enabled = false, description = "Alert method - dismiss")
	public void dismiss() throws InterruptedException {
		launch_browser();
		WebElement click = this.d.findElement(By.xpath("//button[@id='confirmButton']"));

		WebDriverWait ww = new WebDriverWait(d, Duration.ofSeconds(30));
		ww.until(ExpectedConditions.elementToBeClickable(click));

		JavascriptExecutor js =  (JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", click);

		Alert alr = d.switchTo().alert();
		System.out.println(alr.getText());
		alr.accept();
		
		js.executeScript("arguments[0].click();", click);
		System.out.println(alr.getText());
		alr.dismiss();
		
		d.quit();
	}
	
	@Test(enabled = true, description = "Alert method - sendkeys")
	public void sendkey() throws InterruptedException {
		launch_browser();
		WebElement click = this.d.findElement(By.xpath("//button[@id='promtButton']"));

		WebDriverWait ww = new WebDriverWait(d, Duration.ofSeconds(30));
		ww.until(ExpectedConditions.elementToBeClickable(click));

		JavascriptExecutor js =  (JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", click);
		Thread.sleep(5000);
		Alert alr = d.switchTo().alert();
		System.out.println(alr.getText());
		Thread.sleep(Duration.ofSeconds(5));
		alr.sendKeys("hi");
		alr.accept();
		Thread.sleep(Duration.ofSeconds(5));
		d.quit();
	}

}
