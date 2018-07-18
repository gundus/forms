package com.cruk.forms.tests;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cruk.forms.data.FileDataProvider;
import com.cruk.forms.data.FormField;
import com.cruk.forms.data.FormsDataProvider;
import com.cruk.forms.data.InMemoryDataProvider;
import com.cruk.forms.pages.YourDetailsPage;
import com.cruk.forms.utils.DriverUtils;

public class SspValidFormSubmission {
	private static final Logger LOG = LoggerFactory.getLogger(SspValidFormSubmission.class);


	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = DriverUtils.getDriver();
	}

	@Test()
	public void ssp_fillInYourDetailsPage() {
		LOG.debug("ssp_fillInYourDetailsPage");
		YourDetailsPage yourDetailsPage = new YourDetailsPage();
		yourDetailsPage.navigateToSspPage();
		FormsDataProvider provider = new FileDataProvider();
	// FormsDataProvider provider = new InMemoryDataProvider();
		Map<String, FormField> valueMap = provider.getData();
		for (String fieldId : valueMap.keySet()) {
			if (valueMap.get(fieldId).getFieldType().equals("text")) {
				yourDetailsPage.enterFieldValue(fieldId, valueMap.get(fieldId).getFieldValue());
			} else if (valueMap.get(fieldId).getFieldType().equals("lov")) {
				yourDetailsPage.selectIfOptionTextEquals(By.id(fieldId), valueMap.get(fieldId).getFieldValue());
			}
		}

	}

	/*
	 * @AfterClass 
	 * public void tearDown() { driver.quit(); }
	 */

}
