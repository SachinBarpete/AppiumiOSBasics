package com.bridgelabz.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;

import io.appium.java_client.ios.IOSDriver;

/**
 * @author Sachin Barpete
 * @purpose Handle picker view in UICatalog application
 * @date 11/01/2020
 */
public class PickerViewTest extends Base {

	@Test
	public void pickerViewTest() throws InterruptedException {
		IOSDriver<WebElement> driver = setup();
		driver.findElementByAccessibilityId("Picker View").click();
		Thread.sleep(2000);
		List<WebElement> values = driver.findElementsByXPath("//XCUIElementTypePickerWheel");

		for (int i = 0; i < values.size(); i++)
			System.out.print(values.get(i).getText() + "   ");

		Thread.sleep(500);
		values.get(0).sendKeys("50");
		Thread.sleep(500);
		values.get(1).sendKeys("100");
		Thread.sleep(500);
		values.get(2).sendKeys("200");
		Thread.sleep(3000);
		driver.quit();

	}
}
