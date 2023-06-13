package SeleniumInterviewQuestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextBoxJS {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("document.getElementById('email').setAttribute('value','karthickarun87@gmail.com')");
		j.executeScript("document.getElementById('pass').setAttribute('value','Arunsingh@1988')");
		
		
	}

}
