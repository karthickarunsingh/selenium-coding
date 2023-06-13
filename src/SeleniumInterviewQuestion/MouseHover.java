package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://www.greenstechnologys.com/");
		
		WebElement course = d.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions a = new Actions(d);
		a.moveToElement(course).perform();	
		
		WebElement oracle = d.findElement(By.xpath("//span[text()='Oracle Training']"));	
		
		a.moveToElement(oracle).perform();
		
		WebElement sql = d.findElement(By.xpath("//span[text()='SQL Certification']"));
		
		a.moveToElement(sql).click().perform();
		
		
	}

}
