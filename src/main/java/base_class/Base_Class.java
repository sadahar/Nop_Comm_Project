package base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

	WebDriver driver;

	public WebDriver browser_launch() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\diff browser\\Chrome\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();

		return driver;

	}

}
