package Testing_demo;
import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class POST_cmd {
	
	public static HashMap map= new HashMap();
	Data_for_test use=new Data_for_test();
	
	@Test
	public void Post_req()
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
		;
	}
	
	@Test
	public void Post_req1()
	{
		map.put("name", use.name);
		map.put("job", use.job);
		
		given()
			.contentType("application/json")
			.body(map)
		
		.when()
			.post(use.BaseURL+use.Post_url)
		
		.then()
			.log().all()
		;
	}
}