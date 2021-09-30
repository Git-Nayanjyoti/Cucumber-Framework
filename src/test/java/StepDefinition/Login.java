package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User enters username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
	
		WebDriverManager.chromedriver().setup();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user clicks on Login Button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
	    //throw new io.cucumber.java.PendingException();
	}


}
