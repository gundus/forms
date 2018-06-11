package com.cruk.forms.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DriverUtils {

public static WebDriver driver;

@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\unsubme\\src\\test\\java\\com\\bigmantra\\unsubme\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	}

public static WebDriver getDriver() {
    if ( driver == null) {
        driver = new ChromeDriver();
    }
    return driver;
}

@After
public void tearDown() throws Exception {
    driver.close();
    driver.quit();
}
}

