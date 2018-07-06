package com.cruk.forms.tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cruk.forms.data.FormsDataProvider;
import com.cruk.forms.data.InMemoryDataProvider;
import com.cruk.forms.pages.YourDetailsPage;
import com.cruk.forms.utils.DriverUtils;

public class SspValidFormSubmission {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = DriverUtils.getDriver();
	}

	// @DataProvider
	// public Object[] getData() {
	//
	// FormsDataProvider provider=new InMemoryDataProvider();
	// provider.getData();
	//
	// Object[] data =
	//
	//
	// }

	@Test()
	public void ssp_fillInYourDetailsPage() {
		YourDetailsPage yourDetailsPage = new YourDetailsPage();
		yourDetailsPage.navigateToSspPage();
		FormsDataProvider provider = new InMemoryDataProvider();
		Map<String, String> valueMap = provider.getData();
		for (String fieldId : valueMap.keySet()) {
			yourDetailsPage.enterFieldValue(fieldId, valueMap.get(fieldId));
		}

	}

/*	@AfterClass
	public void tearDown() {
		driver.quit();
	}*/

}
