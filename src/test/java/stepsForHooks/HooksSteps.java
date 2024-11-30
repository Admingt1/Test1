
package stepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import apppages.dashboard;
import apppages.urlpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.UtilityScreenshot;


public class HooksSteps {

	WebDriver driver =null;
	urlpage logn;
	dashboard dash;
	UtilityScreenshot Utility;
	
	
	@Before
public void browserSetup() {
		
		System.out.println("I am inside Browser Setup ");
	System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
     driver.manage().window().maximize();
	System.out.println(" Url and driver is set ");
	}	
  //  public void setUpScenario(Scenario scenario){
 //   UtilityScreenshot.message = scenario; 
	@After
	public void teardown() {
		driver.close();
		driver.quit();	
	}
	
	public void doSomethingAfterStep(Scenario scenario){
	}
	
	


	@And("user is in login page")
	public void user_is_in_login_page() {
		System.out.println("Inside - step user is on login page");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^user input (.*) and (.*)$")
	public void user_input_username_and_password(String username, String password) {
		logn= new urlpage(driver);
		logn.enterUsername(username);
		logn.enterPassword(password);
		
		
		//driver.findElement(By.id("email")).sendKeys(username);
		//driver.findElement(By.id("passwd")).sendKeys(password);


	}
		
		@And("user click for login")
		public void user_click_for_login() throws InterruptedException {
			System.out.println("Inside - step hits enter");
			logn.ClickOnlogin();
			
			
			//driver.findElement(By.id("SubmitLogin")).sendKeys(Keys.ENTER);
			//driver.findElement(By.id("SubmitLogin")).click();
			Thread.sleep(2000);
	}

	@Then("user is navigated to the main page")
	public void user_is_navigated_to_the_main_page() {
		
		dash = new dashboard(driver);
		
		//System.out.println("Inside - step user is in guru99 main page");
		dash.equals(dash);
		
		//driver.getPageSource().contains("Successfully Logged in...");
	}
		@Then("user is can not navigated to the main page")
		public void user_is_can_not_navigated_to_the_main_page() {
		    // Write code here that turns the phrase above into concrete actions
			logn.equals(logn);
		   // throw new io.cucumber.java.PendingException();
		   // throw new io.cucumber.java.PendingException();
		}	
}



