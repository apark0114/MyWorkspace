package Login;

import static org.junit.Assert.*;


import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Resources.BaseTest;
import User.Users;

public class loginToCommunity extends BaseTest{

	//private LoginPage loginPage;
	public loginToCommunity(Users user){
		super(user);
	}
	
	/**
	 * This test covers the login as a correct user and the password.
	 * If the the correct home page is displayed, this test passes.
	 */
	@Test
	public void LoginTest(){
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		HomePage homepage = loginPage.loginAs(user.getUserName(), user.getPassword());
		assertEquals("Welcome", homepage.getTitle());
	}
	
}
