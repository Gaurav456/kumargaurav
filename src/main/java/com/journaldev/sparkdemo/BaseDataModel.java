package com.journaldev.sparkdemo;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Dell
 *
 */

@Document(indexName = "basedatamodel", type = "basedatamodel")
public class BaseDataModel implements Serializable  {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String petal_length123;
public String getPetal_length123() {
	return petal_length123;
}

public void setPetal_length123(String petal_length123) {
	this.petal_length123 = petal_length123;
}

private String sepal_length;
private String petal_width;
private String sepal_width;

/*	public String getPetal_length() {
	return petal_length;
}

public void setPetal_length(String petal_length) {
	this.petal_length = petal_length;
}*/

public String getSepal_length() {
	return sepal_length;
}

public void setSepal_length(String sepal_length) {
	this.sepal_length = sepal_length;
}

public String getPetal_width() {
	return petal_width;
}

public void setPetal_width(String petal_width) {
	this.petal_width = petal_width;
}

public String getSepal_width() {
	return sepal_width;
}

public void setSepal_width(String sepal_width) {
	this.sepal_width = sepal_width;
}

	public String toJson() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonData = objectMapper.writeValueAsString(this);
		return jsonData;
	}

}
