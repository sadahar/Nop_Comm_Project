package test_class;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_class.Base_Class;
import pom_class.Pom_Class_For_AddCustm;
import pom_class.Pom_Class_For_Login;

public class Test_CLass_For_Login  {

	WebDriver driver;
	Base_Class baseclass;
	Pom_Class_For_Login Pomclass;
	Pom_Class_For_AddCustm Pomclass_addNew;
	
	

	@BeforeClass
	public void B_Launch() {
		baseclass = new Base_Class();

		driver = baseclass.browser_launch();

		Pomclass = new Pom_Class_For_Login(driver);
		Pomclass_addNew = new Pom_Class_For_AddCustm(driver);
		

	}

	@BeforeMethod
	public void application_login() throws InterruptedException {

		Pomclass.User_Name("admin@yourstore.com");

		Pomclass.Password("admin");

		Pomclass.Login_Button();

	}

	@Test
	public void add_coustermer() throws InterruptedException {
		
		Pomclass_addNew.CLICK_ON_CUSTOMER();
		
		Pomclass_addNew.OPEN_CUSTOMER();
		
		Pomclass_addNew.ADD_NEW();
		
		
	}
	
	
}
