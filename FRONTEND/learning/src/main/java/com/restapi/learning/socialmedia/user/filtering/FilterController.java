package com.restapi.learning.socialmedia.user.filtering;


import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RequestMapping("/api")
@RestController
public class FilterController {

    @GetMapping("/filtering")
    public MappingJacksonValue filtering(){
        SomeBean someBean = new SomeBean("value1", "value2", "value3", "value4");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
        // we only want to return field1 and field2
        SimpleBeanPropertyFilter simpleBeanPropertyFilter =  SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeanFilter", simpleBeanPropertyFilter);
        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue filteringList(){
        // we only want to return field3 and field4
        List<SomeBean> list = Arrays.asList(
                new SomeBean("value1", "value2", "value3", "value4"),
                new SomeBean("value5", "value6", "value7", "value8")
        );
       MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
       SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field3", "field4");
       FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeanFilter", simpleBeanPropertyFilter);
       mappingJacksonValue.setFilters(filterProvider);
       return mappingJacksonValue;
    }

}
