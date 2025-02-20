package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUser extends BaseClass {
	public NewUser() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement newregister;
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="re_password")
	private WebElement repassword;
	@FindBy(id="full_name")
	private WebElement fullname;
	@FindBy(id="email_add")
	private WebElement email;
	@FindBy(id="tnc_box")
	private WebElement terms ;
	@FindBy(id="Submit")
	private WebElement registor;
	@FindBy(id="login")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getNewregister() {
		return newregister;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getRepassword() {
		return repassword;
	}
	public WebElement getFullname() {
		return fullname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getTerms() {
		return terms;
	}
	public WebElement getRegistor() {
		return registor;
	}
	
//	private WebElement
//	private WebElement
//	private WebElement
//	private WebElement
//	
	
	

}
