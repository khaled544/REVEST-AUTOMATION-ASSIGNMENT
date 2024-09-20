package com.qa.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Pages.*;
import com.qa.factory.DriverFactory;
import org.testng.annotations.Test;
import org.testng.Assert;
public class LoginPage {

	
	
	
	private WebDriver driver;

	// 1. By Locators: OR
	private By usernamefield = By.xpath("//input[@id=\"username\"]");
	private By passwordfield = By.id("password");
	private By signInButton = By.xpath("//button[@type='submit']");
	
	private By formAuthenticationButton = By.xpath("//ul//li//a[contains(text(),'Form Authentication')]");
	private By logOutButton = By.xpath("//div//a//i[contains(text(),'Logout')]");
	
	private By welcomeMessageString = By.xpath("//h4[contains(text(),'Welcome')]");
	
	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}


	public void enterUserName(String username) {
		driver.findElement(usernamefield).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(passwordfield).sendKeys(pwd);		
	}

	public void clickOnLogin() throws InterruptedException {
		driver.findElement(signInButton).click();
	}

	public void doLogin(String Username, String Password) {
		System.out.println("login with: " + Username + " and " + Password);
		driver.findElement(usernamefield).sendKeys(Username);
		driver.findElement(passwordfield).sendKeys(Password);
		driver.findElement(signInButton).click();
		
	}

	public void clickFormAuth() throws InterruptedException {
		WebElement formAuth = new WebDriverWait(driver , Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(formAuthenticationButton));
		//driver.findElement(formAuthenticationButton).click();
		formAuth.click();
		System.out.println("user clicked on form authentication");
		
	}
	
	public void doLogout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(logOutButton).click();
		
	}
	
	
	public void getWelcomeMessage() throws InterruptedException {
		Thread.sleep(1000);
		String ReadMessage = driver.findElement(welcomeMessageString).getText();
		System.out.println(ReadMessage);
		String ActualMessage = "Welcome to the Secure Area. When you are done click logout below.";
		Assert.assertEquals(ReadMessage, ActualMessage);	
		
	}
	
}
