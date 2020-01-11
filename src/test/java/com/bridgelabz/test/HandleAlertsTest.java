package com.bridgelabz.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;

import io.appium.java_client.ios.IOSDriver;

/**
 * @author Sachin Barpete
 * @purpose Handle alerts for mobile application
 * @date 11/01/2020
 */
public class HandleAlertsTest extends Base {

	@Test
	public void handleAlertsTest() throws InterruptedException {
		IOSDriver<WebElement> driver = setup();

		driver.findElementByAccessibilityId("AAPLAlertViewController").click();
		Thread.sleep(500);
		driver.findElementByAccessibilityId("Okay / Cancel").click();
		Thread.sleep(200);
		driver.findElementByAccessibilityId("OK").click();

		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Okay / Cancel").click();
		Thread.sleep(200);
		driver.findElementByAccessibilityId("Cancel").click();

		Thread.sleep(2000);
		driver.quit();
	}
}
