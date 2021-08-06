package Demo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import Files.Methods;
import Files.Payload;
public class Basics {

	public static void main(String[] args) throws IOException {
	

		//validate if add place API is working as expected
		//Add place-> Update place with new address-> Get place to validate if new address is present in response		
		//Given- all input details
		//When- submit the api
		//Then- validate the response
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		String response=  given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		//content of the file to string-> content of file can convert into byte-> byte data to String
//		String response4=  given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
//				.body(new String(Files.readAllBytes(Paths.get("addplace.json")))).when().post("maps/api/place/add/json")
//				.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		
		System.out.println(response);
		
		 JsonPath js=Methods.rawTojson(response);//for parsing json
		String placeId=js.getString("place_id");
		
		System.out.println(placeId);
		
		//Update place
		
		String newAddress="70 Summer walk, USA";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//Get place
		
		String response1=given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeId )
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1=new JsonPath(response1);
			String	updatedaddress=js1.getString("address");
		System.out.println(updatedaddress);
		
		Assert.assertEquals(updatedaddress, newAddress);
		
	}

}
