package ScrollDownDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		WebElement down = d.findElement(By.xpath("//a[text()='Watch']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
		Thread.sleep(300);
		WebElement up = d.findElement(By.id("email"));
		
		js.executeScript("arguments[0].scrollIntoView(false)",up);
		
		//Actions ac = new Actions(d);
		//ac.moveToElement(down).perform();
		
		
		
		//WebElement up = d.findElement(By.id("email"));
		
		//ac.moveToElement(up).perform();
		
		//up.sendKeys("karthickarun87@gmail.com");

}}
