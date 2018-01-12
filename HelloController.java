package com.siemens;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@RequestMapping(value="/hello/**")
	public String hello(HttpServletRequest request)
	{
		System.out.println(request.getHeader("access-token"));
		System.out.println(request.getHeader("Authorization"));
		return "Hello from AWS";
	}
}
