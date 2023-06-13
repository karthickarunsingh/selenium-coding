package SeleniumInterviewQuestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		d.findElement(By.name("firstname")).sendKeys("Arun");
		d.findElement(By.name("lastname")).sendKeys("Singh");
		d.findElement(By.name("reg_email__")).sendKeys("karthickarun87@gmail.com");
		d.findElement(By.name("//input[@name='reg_email_confirmation__']")).sendKeys("karthickarun87@gmail.com");
		d.findElement(By.id("password_step_input")).sendKeys("27101988");
		WebElement day = d.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(26);
	}}
		


