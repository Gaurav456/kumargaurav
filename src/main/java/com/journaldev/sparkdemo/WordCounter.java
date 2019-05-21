package com.journaldev.sparkdemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.univocity.parsers.common.fields.ColumnMapper;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.csv.CsvRoutines;

public class WordCounter {

	public static void main(String[] args) throws Exception {

		

		CsvParserSettings settings = new CsvParserSettings();
		settings.detectFormatAutomatically(); 
		settings.getFormat().setLineSeparator("\n");

		settings.setHeaderExtractionEnabled(true);
		
		CsvRoutines routines = new CsvRoutines(settings);

		ColumnMapper mapper = routines.getColumnMapper();

		mapper.attributeToIndex("petal_length", 0);
		mapper.attributeToIndex("petal_width", 2);
		mapper.attributeToIndex("sepal_width", 3);

		routines.setColumnMapper(mapper);
		List<BaseDataModel> rows2 = routines.parseAll(BaseDataModel.class,
				new File("C:\\Users\\Gaurav\\Desktop\\iris.data.csv"));

		ObjectMapper mapper1 = new ObjectMapper();
		mapper1.setSerializationInclusion(Include.NON_NULL);
		mapper1.enable(SerializationFeature.INDENT_OUTPUT);
		
		mapper1.writeValue(System.out, rows2);

	}
}
