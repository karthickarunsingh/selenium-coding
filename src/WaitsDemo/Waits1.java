package WaitsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d = new ChromeDriver(options);
	    d.manage().window().maximize();
	    d.get("https://www.facebook.com/");
	    d.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    
        WebDriverWait w = new WebDriverWait(d, 20);
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[2]")));
        
        
}}
