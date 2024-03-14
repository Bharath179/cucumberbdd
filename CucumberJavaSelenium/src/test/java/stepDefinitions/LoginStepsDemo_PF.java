//package StepDefinitions;
//	import java.time.Duration;
//
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;
//
//	import io.cucumber.java.en.And;
//	import io.cucumber.java.en.Given;
//	import io.cucumber.java.en.Then;
//	import io.cucumber.java.en.When;
//import pagefactory.LoginPage_PF;
//
//	public class LoginStepsDemo_PF {
//
//		WebDriver driver;
//		LoginPage_PF login;
//		
//		@Given("Open the browser")
//		public void open_the_browser() {
//			System.out.println("Inside Step-Open the browser");
//			driver=new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//			System.out.println("Inside Step-user is on login page");
//			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		}
//
//		@When("^user enters valid (.*) and (.*)$")
//		public void user_enters_valid_username_and_password(String username,String password) {
//			System.out.println("Inside Step-user enters valid username and password");
//			
//			login=new LoginPage_PF(driver);
//			//driver.findElement(By.name("username")).sendKeys(username);
//			//driver.findElement(By.name("password")).sendKeys(password);
//			login.setLogin(username, password);
//			
//		}
//		@And("user clicks on login")
//		public void user_clicks_on_login() {
//			System.out.println("Inside Step-user clicks on login");
//			//driver.findElement(By.xpath("//button[@type='submit']")).click();
//			login.clickonLogin();
//		}
//
//		@Then("user should navigate to home page")
//		public void user_should_navigate_to_home_page() {
//			System.out.println("Inside Step-user should navigate to home page");
//			
//			String Expectedtitle="OrangeHRM";
//			String Actualtitle = driver.getTitle();
//			if(Actualtitle.equals(Expectedtitle)) {
//			System.out.println("The title of homepage is correct");
//			}
//			else {
//				System.out.println("The title of homepage is incorrect");
//			}
//			driver.close();
//			driver.quit();
//		}
//	}
//
//
package stepDefinitions;


