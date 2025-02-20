package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatNewAcc extends BaseClass {
	public CreatNewAcc() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement newaccount;
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement surname;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="//label[text()='Female']")
	private WebElement female;
	@FindBy(xpath="//label[text()='Male']")
	private WebElement male;
	@FindBy(xpath="//label[text()='Custom']")
	private WebElement custom;

	@FindBy(name="reg_email__")
	private WebElement email;
	@FindBy(id="password_step_input")
	private WebElement password;
	@FindBy(name="websubmit")
	private WebElement signup;
	public WebElement getNewaccount() {
		return newaccount;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getSurname() {
		return surname;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getGender() {
		return female;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignup() {
		return signup;
	}
	public WebElement getFemale() {
		return female;
	}
	public WebElement getMale() {
		return male;
	}
	public WebElement getCustom() {
		return custom;
	}
	
	

}
