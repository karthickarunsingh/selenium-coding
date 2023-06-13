package TakeScreenShotDemo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException, AWTException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.amazon.in/");
		
		
        TakesScreenshot screenshot = (TakesScreenshot)d;
        File screen = screenshot.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Users\\karth\\Desktop\\ss\\screenshotAs.png");
        FileHandler.copy(screen, file);
        
        
       /* Robot r = new Robot();
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rc = new Rectangle(size);
        BufferedImage image = r.createScreenCapture(rc);
        File file = new File("C:\\Users\\karth\\Desktop\\ss\\image.png");
        ImageIO.write(image, "png", file);*/
        
        
        
        
        
		
		
		
		
		

}}
