package com.cruk.forms.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FormField {
	
	private String fieldName;
	private String fieldValue;
	private String fieldType;
	
	
}