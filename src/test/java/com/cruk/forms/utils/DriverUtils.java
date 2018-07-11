package com.cruk.forms.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class DriverUtils {

public static WebDriver driver;

@BeforeSuite(alwaysRun = true)
public void setup() {
	System.setProperty("webdriver.chrome.driver", "\\src\\test\\java\\com\\cruk\\forms\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	}


public static WebDriver getDriver() {
    if ( driver == null) {
        driver = new ChromeDriver();
    }
    return driver;
}

@AfterSuite(alwaysRun = true)
public void tearDown() throws Exception {
    driver.close();
    driver.quit();
}
}

