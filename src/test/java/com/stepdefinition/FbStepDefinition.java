package com.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.facebook.FbBaseClass;
import com.config.facebook.FbConfigHelper;
import com.google.common.io.Files;
import com.pom.facebook.FaceBookPom;
import com.runner.facebook.FbRunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbStepDefinition extends FbBaseClass {
	public static WebDriver driver = FbRunnerClass.driver;
	FaceBookPom fbpom = new FaceBookPom(driver);

	@Given("user Lauch The Application Url")
	public void user_lauch_the_application_url() throws InterruptedException, IOException {
		
		String url = FbConfigHelper.getInstance().getUrl();
		launchUrl(url);
		sleep();
		
	}

	@When("user Enter The EmailId")
	public void user_enter_the_email_id() throws IOException, InterruptedException {

//		WebElement userEmail = driver.findElement(By.xpath("//input[@id='email']"));
		
		String username = FbConfigHelper.getInstance().getUserName();
		FbBaseClass.userInput(fbpom.getEmail(), username);
		sleep();

	}

	@When("user Enter The Password")
	public void user_enter_the_password() throws IOException {
//		WebElement userPassword = driver.findElement(By.xpath("//input[@type='password']"));
		String username = FbConfigHelper.getInstance().getPassWord();
		
		FbBaseClass.userInput(fbpom.getPassword(), username);
	}

	@Then("user Click The Logbtn")
	public void user_click_the_logbtn() {
//		WebElement userLogin = driver.findElement(By.xpath("//button[text()='Log in']"));
		FbBaseClass.clickOnElement(fbpom.getLoginBtn());
	}

	

	@When("user Go Back And Click On CreateAccount Button")
	public void user_go_back_and_click_on_create_account_button() throws InterruptedException {
		
		sleep();
		
		navigate();

		sleep();

//		WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clickOnElement(fbpom.getCreateNewAccount());

		sleep();
		sleep();

	}

	@When("user Enter The Firstname And Lastname")
	public void user_enter_the_firstname_and_lastname() throws InterruptedException, IOException {
		String firstname = FbConfigHelper.getInstance().getFirstname();
		userInput(fbpom.getFirstName(), firstname);

		String lastname = FbConfigHelper.getInstance().getLastname();
		userInput(fbpom.getLastName(), lastname);

		sleep();
		sleep();

	}

	@When("user Enter The Mobile Number And Password")
	public void user_enter_the_mobile_number_and_password() throws InterruptedException, IOException {
//		WebElement userMobileNum = driver.findElement(By.xpath("//div[text()='Mobile number or email address']"));
//		userMobileNum.sendKeys("1234567890");
		
		String mobilenum = FbConfigHelper.getInstance().getMobilenum();
		FbBaseClass.jsUserinput(fbpom.getMobileNum());
		userInput(fbpom.getMobileNum(), mobilenum);

		sleep();

//		WebElement userNewPassword = driver.findElement(By.xpath("//input[@type='password']"));
//		userNewPassword.sendKeys("java@123");
		
		String newpassword = FbConfigHelper.getInstance().getNewPassword();
		userInput(fbpom.getNewPassword(), newpassword);
		sleep();

	}

	@When("user Select The Date Of Birth")
	public void user_select_the_date_of_birth() throws InterruptedException, IOException {
		
		
		String visibletext = FbConfigHelper.getInstance().getVisibleText();
		String date = FbConfigHelper.getInstance().getDate();
		selectDropDownOption(fbpom.getDay(), visibletext, date);
		sleep();
		
		
		String month = FbConfigHelper.getInstance().getMonth();
		selectDropDownOption(fbpom.getMonth(), visibletext, month);
		sleep();
		
		String year = FbConfigHelper.getInstance().getYear();
		selectDropDownOption(fbpom.getYear(), visibletext, year);
		sleep();
	}

	@When("user Select The Gender And Then Cick On SignUp Button")
	public void user_select_the_gender_and_then_cick_on_sign_up_button() throws InterruptedException {
//		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		clickOnElement(fbpom.getGender());
		sleep();

//		WebElement submit = driver
//				.findElement(By.xpath("//div[@class='large_form']//descendant::button[text()='Sign Up']"));
		clickOnElement(fbpom.getSubmitBtn());

	}


	@When("user Take The ScreenShot")
	public void user_take_the_screen_shot() throws Exception {
		screenshot("Facebook");
	}



	@Then("close The Application Url")
	public void close_the_application_url() throws InterruptedException {

		closeUrl();

	}

}
