package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class_For_Login {

	public Pom_Class_For_Login(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@type='email']")
	private WebElement UN;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement PASS;
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement LOGIN_BUTTON;

	public void User_Name(String user) throws InterruptedException {
		UN.clear();
		Thread.sleep(1000);
		UN.sendKeys(user);
	}

	public void Password(String pass) throws InterruptedException {
		PASS.clear();
		Thread.sleep(1000);
		PASS.sendKeys(pass);
		Thread.sleep(1000);
	}

	public void Login_Button() {
		LOGIN_BUTTON.click();

	}
}
