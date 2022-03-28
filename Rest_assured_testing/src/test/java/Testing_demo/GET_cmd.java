package Testing_demo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET_cmd {
	
	Data_for_test use=new Data_for_test();
	
	@Test
	public void get_cmd()
	{
		given()
		
		.when()
			.get(use.BaseURL
				+ use.Get_url)
		.then()
			.statusCode(200)
			.assertThat().body("page",equalTo(2))
			.assertThat().body("total", equalTo(12))
		  
		;
		
	}
	
	@Test
	public void get_cmd1()
	{
		given()
		
		.when()
			.get(use.BaseURL
				+ use.Get_url)
		.then()
			.statusCode(200)
			.log().all()
		  
		;
	}

}
