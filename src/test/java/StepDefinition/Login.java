package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;

	//[Test1][Test2][Test3]
	// method to open login page of OrangeHRM
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		// throw new io.cucumber.java.PendingException();
	}

	//[Test1]
	// method to enter single username
	@When("User enters username")
	public void user_enters_username() {
		WebDriverManager.chromedriver().setup();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// throw new io.cucumber.java.PendingException();
	}

	//[Test1]
	// method to enter single password
	@When("user enters password")
	public void user_enters_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		// throw new io.cucumber.java.PendingException();
	}

	//[Test1]
	// method to enter username as parameter
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		// throw new io.cucumber.java.PendingException();
	}

	//[Test2]
	// method to enter password as parameter
	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		// throw new io.cucumber.java.PendingException();
	}

	//[Test3]
	// This method takes the username and password given in examples of scenario
	// outline
	@When("^User enters (.+) and (.+)$")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		// throw new PendingException();
	}

	//[Test1][Test2][Test3]
	// method to click on the login button
	@Then("user clicks on Login Button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
		// throw new io.cucumber.java.PendingException();
	}

	//[Test1][Test2][Test3]
	//method to that close the browser on successfully logging in
	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		// Method to login successfully and close the browser
		driver.close();
		// throw new io.cucumber.java.PendingException();
	}

}
