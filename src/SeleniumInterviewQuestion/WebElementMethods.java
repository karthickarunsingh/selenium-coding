package SeleniumInterviewQuestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementMethods {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
	    d.get("https://www.amazon.in/");
	    String url = d.getCurrentUrl();
	    System.out.println(url);
	    String title = d.getTitle();
	    System.out.println(title);
	    WebElement searchBox = d.findElement(By.id("twotabsearchtextbox"));
	    String name = searchBox.getTagName();
	    System.out.println(name);
	    Point location = searchBox.getLocation();
	    System.out.println(location);
	    Dimension dimension = searchBox.getSize();
	    System.out.println(dimension);
	    String attribute = searchBox.getAttribute("placeholder");
	    System.out.println(attribute);
	    boolean displayed = searchBox.isDisplayed();
	    System.out.println(displayed);
	    boolean enabled = searchBox.isEnabled();
	    System.out.println(enabled);
	    boolean selected = searchBox.isSelected();
	    System.out.println(selected);
	    searchBox.submit();
	   // searchBox.sendKeys("iphone 14 pro");
	    //Thread.sleep(200);
	    //searchBox.clear();
	    //Robot r = new Robot();
	    //r.keyPress(KeyEvent.VK_ENTER);
	    //r.keyRelease(KeyEvent.VK_ENTER);
	    //d.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro (128 GB) - Deep Purple'])[1]")).click();
	    WebElement text = d.findElement(By.xpath("//a[text()='Germany']"));
	    String string = text.getText();
	    System.out.println(string);
	    
	    
	    
	    
	    
	
	}

}
