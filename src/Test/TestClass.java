package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {
	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.amazon.in/");
		String url = d.getCurrentUrl();
		System.out.println(url);
		String title = d.getTitle();
		System.out.println(title);
		WebElement searchBox = d.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 14 pro");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		d.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro (128 GB) - Silver'])[1]")).click();
		String parentWindow = d.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allwindow = d.getWindowHandles();
		int size = allwindow.size();
		System.out.println(allwindow);
		System.out.println(size);
		
		List<String> li = new ArrayList<String>();
		li.addAll(allwindow);
		System.out.println(li);
		
		String x = li.get(1);
		d.switchTo().window(x);
		
			
		
		
		d.findElement(By.id("add-to-cart-button")).click();
		

		
	}}
			
		
	
		