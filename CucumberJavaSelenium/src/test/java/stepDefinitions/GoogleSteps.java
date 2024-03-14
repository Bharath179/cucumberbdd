package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GoogleSteps {
	
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside Step-browser is open");
	    
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step-user is on google search page");
		driver.get("https://www.google.com");
		
	}

	@When("user a enters text in search box")
	public void user_a_enters_text_in_search_box() {
		System.out.println("Inside Step-user a enters text in search box");
		
		driver.switchTo().activeElement().sendKeys("Step by Step Automation");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step-hits ente");
		
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step-user is navigated to search results");
		
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
	}

}
