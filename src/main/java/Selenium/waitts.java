package Selenium;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitts {

	@FindBy(xpath = "nuj")
	public WebElement ele;

	static WebDriver  d;
	WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));

	private void launch_browser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");
	}

	public void implis_wait() {
		launch_browser();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}



	public void elementToBeClickable() {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		WebElement element = d.findElement(By.id("submitButton"));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void alertIsPresent() {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}

	public void elementToBeClickable_locator() {
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("submitButton")));
		button.click();
	}


	public void elementToBeSelected_locator() {
		boolean isSelected = wait.until(ExpectedConditions.elementToBeSelected(By.id("checkbox")));
		System.out.println(isSelected);
	}

	public void elementToBeSelected() {
		WebElement checkbox = d.findElement(By.id("checkbox"));
		wait.until(ExpectedConditions.elementToBeSelected(checkbox));
	}

	public void frameToBeAvailableAndSwitchToIt_locator() {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("frameName")));
	}

	public void frameToBeAvailableAndSwitchToIt() {
		WebElement frame = d.findElement(By.id("frameId"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
	}

	public void invisibilityOf() {
		wait.until(ExpectedConditions.invisibilityOf(d.findElement(By.id("loadingSpinner"))));
	}

	public void invisibilityOfElementLocated() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingSpinner")));
	}

	public void invisibilityOfElementWithText() {
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("status"), "Loading..."));

	}

	public void presenceOfElementLocated() {
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		element.clear();
	}

	public void presenceOfAllElementsLocatedBy() {
		List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("items")));
	}

	public void textToBePresentInElement() {
		wait.until(ExpectedConditions.textToBePresentInElement(d.findElement(By.id("message")), "Success"));
	}

	public void textToBePresentInElementLocated() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("message"), "Success"));
	}

	public void textToBePresentInElementValue() {
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("inputField"), "ExpectedValue"));
	}

	public void titleContains() {
		wait.until(ExpectedConditions.titleContains("Dashboard"));
	}

	public void titleIs() {
		wait.until(ExpectedConditions.titleIs("Login Page"));
	}

	public void urlContains() {
		wait.until(ExpectedConditions.urlContains("dashboard"));
	}

	public void urlToBe() {
		wait.until(ExpectedConditions.urlToBe("https://example.com/dashboard"));
	}

	public void urlMatches() {
		wait.until(ExpectedConditions.urlMatches(".*dashboard.*"));
	}
	
	public void visibilityOf() {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(d.findElement(By.id("submitButton"))));
		System.out.println(element);
	}

	public void visibilityOfAllElements() {
		List<WebElement> elements = d.findElements(By.className("items"));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public void visibilityOfAllElementsLocatedBy() {
		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("items")));
	}

	public void visibilityOfElementLocated() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		
		
		wait.until(ExpectedConditions.textMatches(By.id("status"), Pattern.compile("Success.*")));

		wait.until(ExpectedConditions.or(
			    ExpectedConditions.visibilityOfElementLocated(By.id("element1")),
			    ExpectedConditions.presenceOfElementLocated(By.id("element2"))
			));
		
		
		wait.until(ExpectedConditions.and(
			    ExpectedConditions.visibilityOfElementLocated(By.id("element1")),
			    ExpectedConditions.elementToBeClickable(By.id("element1"))
			));


		wait.until(ExpectedConditions.not(
			    ExpectedConditions.textToBePresentInElementLocated(By.id("status"), "Processing")
			));

		WebElement childElement = wait.until( ExpectedConditions.presenceOfNestedElementLocatedBy(By.id("parent"), By.id("child")));
	
		
		
		WebElement parent = d.findElement(By.id("parent"));
		WebElement childElement2 = wait.until(
		    ExpectedConditions.presenceOfNestedElementLocatedBy(parent, By.id("child")));
		
		wait.until(ExpectedConditions.stalenessOf(d.findElement(By.id("oldElement"))));


		wait.until(ExpectedConditions.invisibilityOf(d.findElement(By.id("loadingIcon"))));
	
	
		wait.until(ExpectedConditions.domPropertyToBe(element, "innerHTML", "ExpectedValue"));
		
		wait.until(ExpectedConditions.domAttributeToBe(element, "type", "submit"));

		wait.until(ExpectedConditions.attributeToBe(element, "class", "active"));

		wait.until(ExpectedConditions.attributeToBe(By.id("username"), "placeholder", "Enter username"));
	
		wait.until(ExpectedConditions.attributeContains(By.id("message"), "class", "success"));
		
		
		wait.until(ExpectedConditions.attributeContains(element, "style", "display: block"));
		

	}

	public  void fluent() {
		Wait<WebDriver> f = new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(39))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);
				f.until(ExpectedConditions.visibilityOf(ele));
		
	}



}
