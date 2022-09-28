package com.runner.facebook;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.facebook.FbBaseClass;
import com.config.facebook.FbConfigHelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\facebook.feature",
glue = "com.stepdefinition")

public class FbRunnerClass {

		public static WebDriver driver;
		
		@BeforeClass
		public static void setUp() throws IOException {
			String browser =FbConfigHelper.getInstance().getBrowser();
			driver= FbBaseClass.browserLaunch(browser);
		}
		
		@AfterClass
		public static void tearDown() {

			FbBaseClass.quit();
		}

}

