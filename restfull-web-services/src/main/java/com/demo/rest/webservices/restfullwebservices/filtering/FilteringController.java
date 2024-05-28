package com.demo.rest.webservices.restfullwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	
    @GetMapping("/filtering")
	public SomeBean getDatat() {
		return new SomeBean("Value1", "Value2", "Value3", "Value4");
	}
    
    @GetMapping("/filtering-list")
    public List<SomeBean> getDataFileter(){
    	return Arrays.asList(new SomeBean("Value1", "Value2", "Value3", "Value4"), new SomeBean("Value5", "Value6", "Value7", "Value8"));
    }
    
    @GetMapping("/filtering-dynamic")
	public MappingJacksonValue getData2() {
    	SomeBean someBean = new SomeBean("Value1", "Value2", "Value3", "Value4");
    	MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
    	SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("filed1", "field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		mappingJacksonValue.setFilters(filters);
		return mappingJacksonValue;
	}
    
    @GetMapping("/filtering-list-dynamic")
    public MappingJacksonValue getDataFileter2(){
    	
    	List<SomeBean> list = Arrays.asList(new SomeBean("Value1", "Value2", "Value3", "Value4"), new SomeBean("Value5", "Value6", "Value7", "Value8"));
    	MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
    	SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field3", "field4");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		mappingJacksonValue.setFilters(filters);
    	
    	return mappingJacksonValue;
    }
    
    
    
}
