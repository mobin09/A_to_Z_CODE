package com.demo.rest.webservices.restfullwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"field3", "field4"})
@JsonFilter("SomeBeanFilter")
public class SomeBean {
     private String filed1;
     //@JsonIgnore
     private String field2;
     private String field3;
     private String field4;
	public SomeBean(String filed1, String field2, String field3, String field4) {
		super();
		this.filed1 = filed1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
	}
	public String getFiled1() {
		return filed1;
	}
	public String getField2() {
		return field2;
	}
	public String getField3() {
		return field3;
	}
	public String getField4() {
		return field4;
	}
          
}
