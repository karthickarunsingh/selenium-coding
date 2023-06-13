package WebTableDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement tableRows = d.findElement(By.id("customers"));
		List<WebElement> tableDatas = tableRows.findElements(By.tagName("td"));
		for (WebElement tableData : tableDatas) {
			String text = tableData.getText();
			System.out.print(text);
		}
			
		}

}
