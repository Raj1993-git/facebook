package org.baseclass;

import org.classes.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class basefb {
	
	public static WebDriver driver;
	public static WebElement  xp(String s) {
		return driver.findElement(By.xpath(s));
}
	public static void launch(String s) {
		hooks.driver.get(s);

	}
	public static void SendKe(WebElement e,String s) {
		e.sendKeys(s);

	}
	public static void cl(WebElement e) {
		e.click();
	}

}
