package SeleniumInterviewQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		
		
		
		JavascriptExecutor j = (JavascriptExecutor)d;
		
		for (int i = 0; i < 10; i++) {
			j.executeScript("window.scrollBy(0,500)");
			
		Thread.sleep(200);
		}
		
		for (int i = 0; i < 10; i++) {
			j.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(200);
		}
		
		
		
		
		
		
		
		
	}
}
