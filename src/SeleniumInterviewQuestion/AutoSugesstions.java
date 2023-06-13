package SeleniumInterviewQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSugesstions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> list = d.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement list1 : list) {
			String text = list1.getText();
			System.out.println(text);
			
		}
			
			
		}}
		
		/*To get address of all suggestion
		String s = "//span[contains(text(),'selenium')]";
		List<WebElement> list = d.findElements(By.xpath("s"));
		int size = list.size();
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			WebElement element = list.get(i);
			String string = element.getText();
			System.out.println(string);*/
		
			
	

//}
