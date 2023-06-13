package SeleniumInterviewQuestion;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScannerBrowserLaunch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String browser = sc.nextLine();
		WebDriver driver = null;
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\karth\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
		}else {
			System.out.println("invalid browser");
		}if(browser=="Chrome") {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the url");
			String url = s.nextLine();
			
			
		}
	}

}
