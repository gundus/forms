package com.cruk.forms.enums;

public enum Url {

	BASEURL("https://www.cancerresearchuk.org"), 
	SSPFORM("/support-us/find-an-event/sports-sponsorship-pack");

	String url;

	Url(String url) {
		this.url = url;
	}

	public String getURL() {
		return url;
	}
}
