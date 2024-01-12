package TestCases;

import org.testng.annotations.Test;

import PageObject.Login_Page;

//This class is to test existing users. 
public class LoginTest extends BaseClass {
	// Existing Users credentials
	String adminUserName = "admin@klues.ai";
	String adminPassword = "Demo$123";
	String employeeUserName = "pradeep@gmail.com";
	String employeePassword = "Pradeep@1234";
	String supervisorUserName = "supervisor@gamil.com";
	String supervisorPassword = "Supervisor@123";
	String reviewerUserName = "reviewer@gmail.com";
	String reviewerPassword = "Reviewer@123";
	
	String wrongPassword = "fbvfhdjv";
	String wrongEmailAddress = "hello@gmail.com";
	
	@Test(priority = 0, description = "Login Functionality check with correct username and password(Existing user, Admin)")
	public void adminUserLoginTest() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(adminUserName, adminPassword);
	}

	@Test(priority = 1, enabled = true, testName = "Login Functionality for Employee user.", description = "Login Functionality check with correct username and password(Existing user, Employee)")
	public void employeeUserLoginTest() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(employeeUserName, employeePassword);
	}

	@Test(priority = 2, testName = "TC0003", description = "Login Functionality check with correct username and password(Existing user, Supervisor)")
	public void supervisorUserLoginTest() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(supervisorUserName, supervisorPassword);
	}

	@Test(priority = 3, testName = "TC0004", description = "Login Functionality check with correct username and password(Existing user, Supervisor)")
	public void reviewerUserLoginTest() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(reviewerUserName, reviewerPassword);
	}
	
	@Test(priority = 4, testName = "TC0005", description = "Login Functionality check with incorrect username and correct password(Existing user, Any login)")
	public void loginWithWrongPassword() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(adminUserName, wrongPassword);
	}
	@Test(priority = 5, testName = "TC0006", description = "Login Functionality check with incorrect username and correct password(Existing user, Any login)")
	public void loginWithWrongUserName() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(wrongEmailAddress, adminPassword);
	}
	@Test(priority = 6, enabled = true,testName = "TC007", description = "Login Functionality check inactive users (Existing user, Any login)")
	public void loginTestForInactiveUsers() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(adminUserName, adminPassword);
		loginPage.inactiveUserLogin();
	}
	
}