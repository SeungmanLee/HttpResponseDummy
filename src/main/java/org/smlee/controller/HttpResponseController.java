package org.smlee.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HttpResponseController {

	private String contents; 
	
	@RequestMapping(value="/")
	public String hello()
	{
		return "Hello";
	}
	
	// set response json contents.  
	@RequestMapping(value="/setResponse")
	public String setResponse( @RequestBody String contents )
	{
		this.contents = contents;
		return this.contents;
	}
	
	// allow any url.  just return contents
	@RequestMapping(value="/**")
	public String getResponse()
	{
		return this.contents;
	}
	
}
