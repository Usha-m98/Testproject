package demo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class TestOnLocalAPI 
{
//@Test
public void get()
{
	baseURI="http://localhost:3000";
	given().get("/Users").then().statusCode(200).log().all();
	}
//@Test
public void post()
{
	JSONObject request=new JSONObject();
	
	request.put("first_name","usha");
	request.put("last_name","m");
	
	baseURI="http://localhost:3000";
	
	given().
	contentType(ContentType.JSON).accept(ContentType.JSON).
	body(request.toJSONString()).
	when().
	post("/Users").
	then().
	statusCode(201).log().all();
	
}
//@Test
public void put()
{
	JSONObject request=new JSONObject();
	
	request.put("first_name","usha");
	request.put("last_name","gowda");
	
	baseURI="http://localhost:3000";
	
	given().
	contentType(ContentType.JSON).accept(ContentType.JSON).
	body(request.toJSONString()).
	when().
	put("/Users/8").
	then().
	statusCode(200).log().all();
	
}
@Test
public void patch()
{
	JSONObject request=new JSONObject();
	
	request.put("first_name","usha m");
	
	
	baseURI="http://localhost:3000";
	
	given().
	contentType(ContentType.JSON).accept(ContentType.JSON).
	body(request.toJSONString()).
	when().
	patch("/Users/8").
	then().
	statusCode(200).log().all();
	
}

@Test
public void delete()
{
	baseURI="http://localhost:3000";
	
	when().delete("/Users/5").then().statusCode(404).log().all();
}

}
