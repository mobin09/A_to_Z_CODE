package com.demo.rest.webservices.restfullwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionPersonController {
	@GetMapping("/v1/person")
	public Personv1 getPersonv1() {
		return new Personv1("Mobin Arshad");
	}
	@GetMapping("/v2/person")
	public Personv2 getPersonv2() {
		return new Personv2(new Name("Mobin", "Arshad"));
	}
	
	
	@GetMapping(path = "/person", params = "version=1")
	public Personv1 getPersonv1RequestParam() {
		return new Personv1("Washim Arshad");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public Personv2 getPersonv2RequestParam() {
		return new Personv2(new Name("Washim", "Arshad"));
	}
	
	
	@GetMapping(path = "/person", headers="X-API-VERSION=1")
	public Personv1 getPersonv1RequestHeader() {
		return new Personv1("Nadim Arshad");
	}
	
	
	@GetMapping(path = "/person", headers = "X-API-VERSION=2")
	public Personv2 getPersonv2RequestHeader() {
		return new Personv2(new Name("Nadim", "Arshad"));
	}
	
}
