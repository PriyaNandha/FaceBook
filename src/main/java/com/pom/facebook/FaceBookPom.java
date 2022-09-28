package com.pom.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPom {
	public WebDriver driver;
	
	public FaceBookPom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createnewaccount;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
	private WebElement mobilenum;
	
	@FindBy(xpath = "//div[@id='reg_box']//descendant::input[@type='password']")
	private WebElement newpassword;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement day;
	
	@FindBy(xpath = "//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@id='year']")
	private WebElement year;
	
	@FindBy(xpath = "//label[text()='Female']")
	private WebElement gender;
	
	@FindBy(xpath = "//div[@class='large_form']//descendant::button[text()='Sign Up']")
	private WebElement submitbtn;
	
	public WebElement getSubmitBtn() {
		
		return submitbtn;
	}
	public WebElement getGender() {
		return gender;
	}
	
	public WebElement getYear() {
		return year;
	}
	public WebElement getMonth() {
		return month;
	}
	
	public WebElement getDay() {
		
		return day;
	}
	
	public WebElement getNewPassword() {
		return newpassword;
	}
	
	public WebElement getMobileNum() {
		return mobilenum;
	}
	
	public WebElement getLastName() {
		return lastname;
	}
	
	public WebElement getFirstName() {
		return firstname;
	}
	
	public WebElement getCreateNewAccount() {
		return createnewaccount;
	}
	
	public WebElement getLoginBtn() {
		return loginbtn;
		
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getEmail() {
		
		return email;
	}
	
	
	
	
	
	

}
