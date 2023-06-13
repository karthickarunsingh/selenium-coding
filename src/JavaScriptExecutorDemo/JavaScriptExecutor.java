package JavaScriptExecutorDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)d;
	    WebElement uN = d.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','karthickarun87mail.com')",uN);
	    
	    
	    WebElement uP = d.findElement(By.id("pass"));
	    js.executeScript("arguments[0].setAttribute('value','Arunsingh@1988')",uP);
	   
	    
	    Object object = js.executeScript("returnarguments[0].getAttribute('value')",uN);
	    String s = (String)object;
	    System.out.println(s);
	    
	}

}
