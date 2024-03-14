package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.Company;
import pagefactory.LinkedInLogin;

public class TestStepsForLinkedIn {

	WebDriver driver;
	LinkedInLogin l;
	Company c;
	@Given("open the browser")
	public void open_the_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username,String password) {
		l=new LinkedInLogin(driver);
		l.setLogin(username, password);
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		l.clickOnLogin();
	}

	@And("clicks on company field")
	public void clicks_on_company_field() {
		c=new Company(driver);
		c.getCompany().click();
	}

	@When("user enters company name to text field")
	public void user_enters_company_name_to_text_field() {
		c.getCompanytextfield().sendKeys("accetion");
	}

	@And("clicks on search button")
	public void clicks_on_search_button() {
		c.getSearchBtn().click();
	}

	@Then("company data should fetch from linkedIn and display on UI")
	public void company_data_should_fetch_from_linked_in_and_display_on_ui() {
		String text = c.getText().getText();
	System.out.println(text);
	}
}

