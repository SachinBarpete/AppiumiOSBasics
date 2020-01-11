package com.bridgelabz.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;

import io.appium.java_client.ios.IOSDriver;

/**
 * @author Sachin Barpete
 * @purpose Count all elements in the page
 * @date 10/01/2020
 */
public class CountAllElementsTest extends Base {

	@Test
	public void countAllElementsTest() throws InterruptedException {

		IOSDriver<WebElement> driver = setup();
		List<WebElement> listItems = driver.findElementsByXPath("//XCUIElementTypeStaticText");
		Thread.sleep(2000);
		System.out.println("Total elements : " + listItems.size());

		for (WebElement list : listItems)
			System.out.println(list.getText());

		// click on Alert view
		driver.findElementByAccessibilityId("Alert Views").click();
		Thread.sleep(3000);
		driver.quit();
	}
}
