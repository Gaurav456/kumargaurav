package com.journaldev.sparkdemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ColumnIndexMapping {
	
	private int index;
	private String columnname;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getColumnname() {
		return columnname;
	}
	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}
	

	public String toJson() throws JsonProcessingException {
		 ObjectMapper objectMapper = new ObjectMapper();
    	 String jsonData = objectMapper.writeValueAsString(this);
    	 return jsonData;
	}
	
	

}
