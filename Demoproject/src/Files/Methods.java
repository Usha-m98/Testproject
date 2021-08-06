package Files;

import io.restassured.path.json.JsonPath;

public class Methods {

	public static JsonPath rawTojson(String response) 
	{
		JsonPath js=new JsonPath(response);
		return js;
    }

	

}
