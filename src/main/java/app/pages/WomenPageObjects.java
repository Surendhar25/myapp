package app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPageObjects  extends Basepage {

	@FindBy (xpath = "//h1/span[1]")
	private WebElement womenpagetitle;
	
	
	public WomenPageObjects(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getwomenpagetitle()
	{
		return womenpagetitle;
	}
}
