package com.cruk.forms.data;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDataProvider implements FormsDataProvider {

	/* (non-Javadoc)
	 * @see com.cruk.forms.data.DataProvider#getData()
	 */
	@Override
	public Map<String, String> getData() {

		Map<String, String> fieldValueMapping = new HashMap<>();
		fieldValueMapping.put("edit-submitted-event-form-fname", "firstName");
		fieldValueMapping.put("edit-submitted-event-form-sname", "lastName");

		return fieldValueMapping;

	}
}
