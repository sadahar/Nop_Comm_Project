package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class_For_AddCustm {
	
	
	public Pom_Class_For_AddCustm(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//li[@class='nav-item has-treeview'])[4]") private WebElement click_on_customer;
	@FindBy(xpath="((//ul[@class='nav nav-treeview'])[4]//li)[1]") private WebElement open_customer;
	@FindBy(xpath="//a[@class='btn btn-primary']") private WebElement add_new;
	

	
	public void CLICK_ON_CUSTOMER() throws InterruptedException {
		Thread.sleep(1000);
		click_on_customer.click();
		
		}
	
	public void OPEN_CUSTOMER() throws InterruptedException {
		Thread.sleep(1000);
		open_customer.click();
	}

	public void ADD_NEW() throws InterruptedException {
		
		Thread.sleep(2000);
		add_new.click();
	}
	
}
