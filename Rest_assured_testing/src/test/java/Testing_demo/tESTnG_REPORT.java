package Testing_demo;

import static io.restassured.RestAssured.given;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class tESTnG_REPORT {
	
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
		
		Reporter.log("We use testng for this");
	}

}
