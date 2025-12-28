package com.demo.rest.webservices.restfullwebservices.versioning;

public class Personv2 {
    private Name name;
    public Personv2(Name name) {
    	this.name = name;
    }
    
    public Name getName() {
    	return name;
    }
}
