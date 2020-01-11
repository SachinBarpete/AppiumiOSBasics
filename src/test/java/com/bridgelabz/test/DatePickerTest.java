package com.bridgelabz.test;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;

import io.appium.java_client.ios.IOSDriver;

/**
 * @author Sachin Barpete
 * @purpose Handle Date picker in UICatalog application
 * @date 11/01/2020
 */
public class DatePickerTest extends Base {

	@Test
	public void datePickerTest() throws InterruptedException {
		IOSDriver<WebElement> driver = setup();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Date Picker").click();
		Thread.sleep(500);
		List<WebElement> values = driver.findElementsByXPath("//XCUIElementTypePickerWheel");

		for (int i = 0; i < values.size(); i++)
			System.out.print(values.get(i).getText() + "   ");
		values.get(0).sendKeys("Jan 18");
		Thread.sleep(500);
		values.get(0).sendKeys(Keys.TAB);

		values.get(1).sendKeys("3");
		Thread.sleep(500);
		values.get(1).sendKeys(Keys.TAB);

		values.get(2).sendKeys("30");
		Thread.sleep(500);
		values.get(2).sendKeys(Keys.TAB);

		values.get(3).sendKeys("AM");
		Thread.sleep(3000);
		driver.quit();
	}

}
