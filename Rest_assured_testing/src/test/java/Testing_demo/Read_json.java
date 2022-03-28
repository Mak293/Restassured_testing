package Testing_demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read_json {
		
		public JSONObject JASON_parse(String path) throws IOException, ParseException
		{
			JSONParser jsonparser=new JSONParser();
			FileReader reader=new FileReader(path);
			
			Object obj=jsonparser.parse(reader);
			JSONObject emp=(JSONObject)obj;
			
			return emp;	
		}
}

