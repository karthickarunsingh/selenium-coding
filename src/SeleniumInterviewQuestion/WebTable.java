package SeleniumInterviewQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("https://www.toolsqa.com/");
		
		WebElement down = d.findElement(By.xpath("//span[text()='Facebook']"));
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		//js.executeScript("window.scrollBy(0,400)");
		js.executeScript("arguments[0],scrollIntoView(true)",down);
		
		
		
	}

}
