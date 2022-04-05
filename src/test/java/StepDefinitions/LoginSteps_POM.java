package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.loginPage;

public class LoginSteps_POM {
	
	WebDriver driver = null;
	loginPage login;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("=====POM inside step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is : "+ projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		
		login = new loginPage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
	    
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		login.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    
		login.clickLogoutIsDisplayed();
	    driver.close();
	    
	    }
	
}
