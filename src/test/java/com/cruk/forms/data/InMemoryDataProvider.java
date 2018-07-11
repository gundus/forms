package com.cruk.forms.data;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDataProvider implements FormsDataProvider {

	/* (non-Javadoc)
	 * @see com.cruk.forms.data.DataProvider#getData()
	 */
	
	//@Override
	public Map<String, FormField> getData() {

		Map<String, FormField> fieldValueMapping = new HashMap<>();
		fieldValueMapping.put("edit-submitted-event-form-fname", new FormField("fname","giri","text"));
		fieldValueMapping.put("edit-submitted-event-form-sname", new FormField("sname","laksh","text"));

		return fieldValueMapping;

	}
}
