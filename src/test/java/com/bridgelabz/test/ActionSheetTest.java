package com.bridgelabz.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;

import io.appium.java_client.ios.IOSDriver;

/**
 * @author Sachin Barpete
 * @purpose Handle action sheets
 * @date 10/01/2020
 */
public class ActionSheetTest extends Base {

	@Test
	public void actionSheetTest() throws InterruptedException {
		IOSDriver<WebElement> driver = setup();
		driver.findElementByAccessibilityId("Action Sheets").click();
		Thread.sleep(200);
		driver.findElementByAccessibilityId("Other").click();
		Thread.sleep(300);
		driver.findElementByAccessibilityId("Destructive Choice").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Other").click();
		Thread.sleep(300);
		driver.findElementByAccessibilityId("Safe Choice").click();
		Thread.sleep(3000);
		driver.quit();
	}
}
