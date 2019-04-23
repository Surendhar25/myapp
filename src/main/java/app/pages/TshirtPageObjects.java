package app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPageObjects  extends Basepage{


	@FindBy (xpath = "//h1/span[1]")
	private WebElement tshirttitle;
	

	public TshirtPageObjects(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTshirtPageTitile()
	{
		return tshirttitle;
	}
}
