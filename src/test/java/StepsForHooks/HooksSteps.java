package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {

	WebDriver driver = null;
	
	@Before
	public void browserSetup() {
		
		System.out.println("I am inside browser setup");
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	@After
	public void teardown() {
		System.out.println("I am inside teardown");
		driver.close();
		driver.quit();
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
				
	}
	
	@When("user enters valid username and password")
	public void user_enters_username_and_password(String username, String password) {

	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
	}

}
