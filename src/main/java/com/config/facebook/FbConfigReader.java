package com.config.facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FbConfigReader {
	
private Properties p;
	
	public FbConfigReader () throws IOException {
		
		File f = new File("C:\\Users\\GOD\\eclipse-workspace\\FaceBook\\src\\main\\java\\com\\config\\facebook\\FaceBook.properties");
		
		FileInputStream fi = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fi);
		
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getMovetoElement() {
		String movetoelement = p.getProperty("targetelement");
		return movetoelement;
	}

	public String getUserName() {
		String username = p.getProperty("username");
		
		return username;
	}

	public String getPassWord() {
		String password = p.getProperty("password");
		return password;
	}

	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}

	public String getMobilenum() {
		String mobilenum = p.getProperty("mobilenumber");
		return mobilenum;
	}

	public String getNewPassword() {
		String newpassword=p.getProperty("newpassword");
		return newpassword;
	}

	public String getVisibleText() {
		String visibletext = p.getProperty("visibletext");
		return visibletext;
	}

	public String getDate() {
		String date = p.getProperty("date");
		return date;
	}

	public String getMonth() {
		String month = p.getProperty("month");
		return month;
	}

	public String getYear() {
		String year = p.getProperty("year");
		return year;
	}

}
