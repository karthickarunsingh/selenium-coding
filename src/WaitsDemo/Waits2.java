package WaitsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import AlertDemo.Alert;

public class Waits2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d = new ChromeDriver(options);
	    d.manage().window().maximize();
	    d.get("https://www.redbus.com/");
	    
	    
	    d.findElement(By.xpath("//button[text()='Accept All']")).click();
	    
	    WebElement down = d.findElement(By.xpath("//div[text()='It’s all about travel']"));
	    
	    JavascriptExecutor js = (JavascriptExecutor)d;
	    js.executeScript("window.scroll(0,1000)");
	    
	    
	   
       
}}
