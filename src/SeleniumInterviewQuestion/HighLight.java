package SeleniumInterviewQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HighLight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("https://www.adactin.com/HotelApp/index.php");
		
		JavascriptExecutor j = (JavascriptExecutor)d;
		
		WebElement un = d.findElement(By.id("username"));
		
		j.executeScript("arguments[0].setAttribute('style','backgroung:white;border:solid 5px yellow')",un);
		
		un.sendKeys("karthickarun87@gmail.com");
		
	}

}
