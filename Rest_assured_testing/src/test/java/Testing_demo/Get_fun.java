package Testing_demo;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_fun {
	
	
	public Response get_cmd(String baseURI, String basePath)
	{
		RestAssured.baseURI=baseURI;
		RestAssured.basePath=basePath;
		
		Response response=(Response)
		given()
		
		.when()
			.get()
		.then()
			.extract()
		  ;
		
		return response;
		
	}
	
	public Response post_cmd(String baseURI, String basePath,JSONObject payload)
	{
		RestAssured.baseURI=baseURI;
		RestAssured.basePath=basePath;
		
		Response response=(Response)
				given()
				.contentType("application/json")
				.body(payload)
				
				.when()
					.post()
				.then()
					.extract()
				  ;
		
		return response;
	}
	
	public Response put_cmd(String baseURI, String basePath,JSONObject payload)
	{
		RestAssured.baseURI=baseURI;
		RestAssured.basePath=basePath;
		
		Response response=(Response)
				given()
				.contentType("application/json")
				.body(payload)
				.when()
					.put()
				.then()
					.extract()
				  ;
		
		return response;
	}
	
	public Response delete_cmd(String baseURI, String basePath)
	{
		RestAssured.baseURI=baseURI;
		RestAssured.basePath=basePath;
		
		Response response=(Response)
				given()
				
				.when()
					.delete()
				.then()
					.extract()
				  ;
		
		return response;
	}
	


}
