package com.APITesting.TestBase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	WebDriver driver;
	// LoginPageObjects login;

	public TestBase(WebDriver driver) {
		this.driver = driver;
		// DOMConfigurator.configure("log4j.xml");
	}

	public void WaiteForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public boolean isAlertPresent() throws InterruptedException {

		boolean presentFlag = false;

		try {

			// Check the presence of alert
			Alert alert = driver.switchTo().alert();
			// Alert present; set the flag
			presentFlag = true;
			// if present consume the alert
			alert.accept();
			// ( Now, click on ok or cancel button )

		} catch (NoAlertPresentException ex) {
			// Alert not present
			// ex.printStackTrace();
		}

		return presentFlag;
	}

}
