package com.victor.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.swagger.model.SwaggerModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="api/swagger")
@Api(value = "User", description = "REST API for User", tags = { "User" })
public class SwaggerController {

	@GetMapping
	@ApiOperation(value="Get User OR List Of Users", response=SwaggerModel.class)
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "User not found") }
	)
	public SwaggerModel get(){
		SwaggerModel demo = getObj();
		return demo;
	}
	
	@PostMapping
	@ApiOperation(value="Create New User", response=SwaggerModel.class)
	/* To define parameters
	 * @ApiImplicitParams({
	 * 
	 * @ApiImplicitParam(name = "firstname", value = "User's first name", required =
	 * true, dataType = "string", paramType = "query"),
	 * 
	 * @ApiImplicitParam(name = "lastname", value = "User's last name", required =
	 * true, dataType = "string", paramType = "query"),
	 * 
	 * @ApiImplicitParam(name = "contact", value = "User's contact number", required
	 * = true, dataType = "string", paramType = "query"),
	 * 
	 * @ApiImplicitParam(name = "active", value = "User's Status", required = true,
	 * dataType = "boolean", paramType = "query") })
	 */
	public SwaggerModel post(@RequestBody SwaggerModel user) {
		return user;
	}
	
	public SwaggerModel getObj() {
		SwaggerModel demo = new SwaggerModel();
		demo.setActive(true);
		demo.setContact("1234567890");
		demo.setFirstName("Abhishek");
		demo.setLastName("Rathore");
		return demo;
	}
}
