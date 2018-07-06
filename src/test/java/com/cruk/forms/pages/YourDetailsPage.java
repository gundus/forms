package com.cruk.forms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cruk.forms.enums.Url;
import com.cruk.forms.utils.CommonUtils;

public class YourDetailsPage extends CommonUtils {

	private final By EVENTLOV = By.id("edit-submitted-event-form-event-code");
	private final By CONFIRMPLACE = By.id("edit-submitted-event-form-confirmed-place-1");
	private final By TITLE = By.id("edit-submitted-event-form-title");
	private final By FSTNAME = By.id("edit-submitted-event-form-fname");
	private final By SURNAME = By.id("edit-submitted-event-form-sname");

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

	//public YourDetailsPage selectFromListOfValue(String id, String value) {

	}