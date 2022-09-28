package com.homepage.facebook;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class FaceBook {

	public static WebDriver driver;
	
	public static void screenshot(String filename) throws Exception {
		Date d = new Date();
		String filename1 = d.toString().replace(':', '_') + ".png";
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
		Files.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File("C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Screenshot" + filename +" " + filename1));
	}

	public static void homePageFaceBook() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement userEmail = driver.findElement(By.xpath("//input[@id='email']"));
		userEmail.sendKeys("java@gmail.com");

		WebElement userPassword = driver.findElement(By.xpath("//input[@type='password']"));
		userPassword.sendKeys("java@123");

		WebElement userLogin = driver.findElement(By.xpath("//button[text()='Log in']"));
		userLogin.click();
		
		

		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

		WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createNewAccount.click();
		Thread.sleep(5000);

		WebElement userFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		userFirstName.sendKeys("Java");

		WebElement userLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		userLastName.sendKeys("java");
		Thread.sleep(2000);

		WebElement userMobileNum = driver.findElement(By.xpath("//div[text()='Mobile number or email address']"));
		userMobileNum.sendKeys("1234567890");
		Thread.sleep(2000);

		WebElement userNewPassword = driver.findElement(By.xpath("//input[@type='password']"));
		userNewPassword.sendKeys("java@123");
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select days = new Select(day);
		days.selectByVisibleText("11");
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select months = new Select(month);
		months.selectByVisibleText("May");
		Thread.sleep(2000);

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select years = new Select(year);
		years.selectByVisibleText("1995");
		Thread.sleep(2000);

		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		Thread.sleep(2000);

		WebElement submit = driver
				.findElement(By.xpath("//div[@class='large_form']//descendant::button[text()='Sign Up']"));
		submit.click();

	}

	public static void main(String[] args) throws InterruptedException {
		homePageFaceBook();
	}

}
