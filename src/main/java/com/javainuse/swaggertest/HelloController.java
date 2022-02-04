package com.javainuse.swaggertest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@ApiOperation(value = "affiche le message \"Hello API\"",  tags = "sayHello")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String sayHello() {
		return "Hello API";
	}
}
