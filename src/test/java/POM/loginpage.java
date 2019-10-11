package POM;

import org.classes.hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public loginpage() {
		PageFactory.initElements(hooks.driver,this);
	}

	@FindBy(id="email")
	private WebElement username;
@FindBy(id="pass")
private WebElement password;
@FindBy(id="loginbutton")
private WebElement btnclick;



public WebElement getBtnclick() {
	return btnclick;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
}
