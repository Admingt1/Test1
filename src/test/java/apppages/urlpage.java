package apppages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class urlpage {
	
	WebElement logn;
	
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(id="app")
	WebElement btn_log_in;
	
	@FindBy(linkText="Invalid credentials")
	WebElement txt_message;
	
	
	WebDriver driver;
	
	public urlpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		
	}
	
public void enterUsername(String username) {
	txt_username.sendKeys(username);
	
}
public void enterPassword(String password) {
	txt_password.sendKeys(password);
}
public void ClickOnlogin() {
	btn_log_in.click();
}
public void message(String message) {
	txt_message.sendKeys(message);
}


}
