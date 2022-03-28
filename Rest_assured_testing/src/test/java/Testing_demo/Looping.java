package Testing_demo;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Looping {
	
	public static HashMap map= new HashMap();
	Data_for_test use=new Data_for_test();
		
	
		@Test
		public void Put_req()
		{
			map.put("name",use.name );
			map.put("job",use.job );
			
			String inpt="Post";
			
			if(inpt.equals("Post"))
			{
			for(int i=1;i<10;i++)
			{
			given()
				.contentType("application/json")
				.body(map)
			
			.when()
				.put(use.BaseURL+"/api/users/"+i)
		
			.then()
				.statusCode(200)
				.log().all()
			;
			}
			}
			
			if(inpt.equals("Delete"))
			{
				for(int i=1;i<10;i++)
				{
				given()
				.contentType("application/json")
			
			.when()
				.delete(use.BaseURL+"/api/users/"+i)
			
			.then()
				.statusCode(204)
			;
			}
			}
		}
	

}
