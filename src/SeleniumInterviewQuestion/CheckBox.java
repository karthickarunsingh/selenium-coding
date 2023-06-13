package SeleniumInterviewQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
		
		//To select one value
		//d.findElement(By.xpath("//input[@value='Cricket']")).click();
		
		WebElement radio = d.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio.click();
			
		
		
		//Select all values
		
		List<WebElement> checkBox = d.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement w : checkBox) {
			w.click();
			
		}
		
		//To select particular two values
		
		//List<WebElement> list = d.findElements(By.xpath("//input[@type='checkbox']"));
		//for (WebElement webElement : list) {
			//if(webElement.getAttribute("value").equals("Cricket")||(webElement.getAttribute("value").equals("Hockey"))){
				//webElement.click();
			//}}
			
			//To select all check box by using normal loop
		/*List<WebElement> list1 = d.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i < list1.size(); i++) {
			WebElement element = list1.get(i);
			element.click();
			
		}*/
		
		//To select particular check box using normal loop
		
		//List<WebElement> list = d.findElements(By.xpath("//input[@type='checkbox']"));
		//for (int i = 0; i < list.size(); i++) {
		//	WebElement element = list.get(i);
			//if(element.getAttribute("value").equals("Cricket")||(element.getAttribute("value").equals("Hockey"))){
				//element.click();
			//}
			//if(list.get(i).isSelected()) {
				//element.click();
			}
			
		//}
			
		}
	//}


