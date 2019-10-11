package org.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;




public class hooks {
	public static WebDriver driver;
	@Before
	public static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajasekar\\Desktop\\number programs\\Practice\\driver materials\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
		}
	
	@After
	public static  void end() {
	driver.quit();

	}
	

}
