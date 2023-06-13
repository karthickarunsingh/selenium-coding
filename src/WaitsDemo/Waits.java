package WaitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d = new ChromeDriver(options);
	    d.manage().window().maximize();
	    //To implicitly wait - its for all locators
	    d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    d.get("https://www.facebook.com/");
	    d.findElement(By.xpath("//a[text()='Create new account']")).click();
	    
	    
	
	}

}
