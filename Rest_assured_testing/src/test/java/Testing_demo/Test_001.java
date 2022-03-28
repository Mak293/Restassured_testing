package Testing_demo;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_001 {
	
	Data_for_test use=new Data_for_test();
	Get_fun obj=new Get_fun();
	Read_json jsn=new Read_json();
	
	@Test
	public void test_100()
	{
		Response res=obj.get_cmd(use.BaseURL,use.Get_url);
		
		System.out.println(res.statusCode());
	}
	
	@Test
	public void test_200()
	{
		String input="delete";
		if(input.equals("get")) {
			Response res=obj.get_cmd(use.BaseURL, use.Get_url);
			System.out.println(res.statusCode());
		}
		else {
			Response res=obj.delete_cmd(use.BaseURL, use.Delete_url);
			System.out.println(res.statusCode());
		}
	}
	
	//".\\Json_File\\employee.json"
	@Test
	public void test_300() throws IOException, ParseException
	{
		Response res=obj.post_cmd(use.BaseURL,use.Post_url,jsn.JASON_parse(".\\Json_File\\employee.json"));
		System.out.println(res.statusCode());
		System.out.println(res.body().asString());
	}
	
	@Test
	public void test_400() throws IOException, ParseException
	{
		Response res=obj.put_cmd(use.BaseURL,use.Put_url,jsn.JASON_parse(".\\Json_File\\employee.json"));
		System.out.println(res.statusCode());
		System.out.println(res.body().asString());
	
		Assert.assertEquals(res.statusCode(),200);
	}

}
