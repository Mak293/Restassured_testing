package Testing_demo;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PUT_cmd {
	
public static HashMap map= new HashMap();
Data_for_test use=new Data_for_test();
	
	@Test
	public void Put_req()
	{
		map.put("name",use.name );
		map.put("job",use.job );
		
		given()
			.contentType("application/json")
			.body(map)
		
		.when()
			.put(use.BaseURL+use.Put_url)
		
		.then()
			.statusCode(200)
		;
	}
	
	@Test
	public void Put_req1()
	{
		map.put("name","Sam" );
		map.put("job","Designer" );
		
		given()
			.contentType("application/json")
			.body(map)
		
		.when()
			.put(use.BaseURL+use.Put_url)
		
		.then()
			.log().all();
		;
	}
}