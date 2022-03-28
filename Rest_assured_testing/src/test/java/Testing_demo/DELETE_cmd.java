package Testing_demo;

import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DELETE_cmd {
	
	Data_for_test use=new Data_for_test();
	
	
	@Test
	public void Delete_req()
	{
		given()
			.contentType("application/json")
		
		.when()
			.delete(use.BaseURL+use.Delete_url)
		
		.then()
			.statusCode(204)
		;
	}
	
	

}
