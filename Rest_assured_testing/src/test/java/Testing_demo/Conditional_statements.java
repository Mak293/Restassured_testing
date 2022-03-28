package Testing_demo;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Conditional_statements {
	
Data_for_test use=new Data_for_test();
public static HashMap map= new HashMap();
	
	
	@Test
	public void Delete_req()
	{
		int user=4;
		
		if(user==2) {
		given()
			.contentType("application/json")
		
		.when()
			.delete(use.BaseURL+use.Delete_url)
		
		.then()
			.statusCode(204)
		;
		}
		
		else
		{
			map.put("name", use.name);
			map.put("job", use.job);
			
			given()
				.contentType("application/json")
				.body(map)
			
			.when()
				.post(use.BaseURL+use.Post_url)
			
			.then()
				.statusCode(201)
				.log().all();
			;
		}
	}
	

}
