package com.cruk.forms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cruk.forms.enums.Url;
import com.cruk.forms.utils.CommonUtils;

public class YourDetailsPage extends CommonUtils {

	public YourDetailsPage() {
	}

	public YourDetailsPage navigateToSspPage() {
		String url = Url.BASEURL.getURL() + Url.SSPFORM.getURL();
		System.out.println("Navigating to SSP form " + url);
		navigateToURL(url);
		return this;

	}

	public YourDetailsPage enterFieldValue(String id, String value) {
		WebElement field = this.getElement(By.id(id));
		this.clearField(field);
		field.sendKeys(value);
		return this;
	}

}