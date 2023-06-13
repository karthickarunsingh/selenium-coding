package WindowHandlingDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d = new ChromeDriver(options);
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.get("https://www.amazon.in/");
		
		WebElement searchBox = d.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("iphone 14 pro");
		WebElement click = d.findElement(By.xpath("//input[@type='submit']"));
		click.click();
		
		WebElement linkIphone = d.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro (128 GB) - Silver'])[1]"));
		linkIphone.click();
		
		String parentWindow = d.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> windowHandles = d.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> li = new ArrayList<String>();
		
		li.addAll(windowHandles);
		System.out.println(li);
		
		String x = li.get(1);
		d.switchTo().window(x);
		
	    WebElement btnCart = d.findElement(By.xpath("//input[@value='Add to Cart']"));
		btnCart.click();	
				
}
}
