package SeleniumInterviewQuestion;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("https://www.adactin.com/HotelApp/index.php");
		WebElement un = d.findElement(By.id("username"));
		un.sendKeys("karthickarun");
		
		WebElement up = d.findElement(By.id("password"));
		up.sendKeys("27101988");
		
		WebElement button = d.findElement(By.id("login"));
		button.click();
		
		TakesScreenshot t = (TakesScreenshot)d;
		File sss = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\karth\\Desktop\\ss\\\\,screenshot.png");
		FileHandler.copy(sss, des);
		
		
	}

}
