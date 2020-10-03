# Swagger-Documentation
 This Project will demonstarte how to document REST API in Sprint Boot And Customize it using annotations
 
 ## @Api
 Can define your resoure with the help of this annotation </br >
 Example :- @Api(value = "User", description = "REST API for User", tags = { "User" })
 
 ## @ApiOperation
 Can define your Api operation with the help of this annotation </br >
 Example :- @ApiOperation(value="Get User OR List Of Users", response=SwaggerModel.class)
 
 ## @ApiResponse
 Can define your Api Response with the help of this annotation </br >
 Example :- @ApiResponse(code = 404, message = "User not found") }
 
 ## @ApiModel
 Can define your Api Models with the help of this annotation </br >
 Example :- @ApiModel(value="User", description="User model")
 
 ## @ApiModelProperty
 Can define your Api Model Properties with the help of this annotation </br >
 Example :- @ApiModelProperty(value = "user's first name", example="Abhishek")
 
## Learn More

You can learn more about the [Annotations](https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X).

Check out the [Swagger Official Documentation](http://docs.swagger.io/swagger-core/v1.5.0/apidocs/index.html).
