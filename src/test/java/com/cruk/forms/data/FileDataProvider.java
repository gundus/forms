package com.cruk.forms.data;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileDataProvider implements FormsDataProvider {

	@Override
	public Map<String, String> getData() {

		Map<String, String> fieldValueMapping = new HashMap<>();
		try {
			FileInputStream file = new FileInputStream(
					new File("src/test/resources/Datasheet.xlsx"));
			Workbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				fieldValueMapping.put(row.getCell(0).toString(), row.getCell(1).toString());
			}
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
		return fieldValueMapping;
	}
}
