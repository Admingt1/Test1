package apppages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {

	

	@FindBy (linkText = "Dashboard")
	ByLinkText text_vf;


	WebDriver deiver;

	public dashboard(WebDriver driver) {
		this.deiver = driver;
		PageFactory.initElements(driver,this);
	}

	public void text_verification() {
		text_vf.equals(text_vf);
	}


}
