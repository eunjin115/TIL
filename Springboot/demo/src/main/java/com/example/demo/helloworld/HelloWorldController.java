package com.example.demo.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@Autowired 	//의존성 주입 (Bean 자동 주입) 
	private MessageSource messageSource;
	
	// GET
	// /hello-world (endpoint)
	//기존 방식 : @RequestMapping(method-RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")	//url 지정
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")	//url 지정
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	//hello-world-been/path-variable/kenneth
	@GetMapping(path = "/hello-world-bean/path-variable/{name}")	//url 지정
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
	@GetMapping(path ="/hello-world-internationalized")
	public String helloWorldInternationalized(
			@RequestHeader(name="Accept-Language", required=false) Locale locale) {
		return messageSource.getMessage("greeting.message", null, locale);
	}
	
}
