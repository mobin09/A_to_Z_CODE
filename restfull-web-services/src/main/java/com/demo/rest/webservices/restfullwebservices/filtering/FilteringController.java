package com.demo.rest.webservices.restfullwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
