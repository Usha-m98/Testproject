package pojo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.awt.List;
import java.util.ArrayList;

import Files.Payload;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_BuilderTest {

	public static void main(String[] args) {
	   //Google maps-Add api	
		//RestAssured.baseURI="https://rahulshettyacademy.com/";
		
		Addplace p=new Addplace();
		p.setAccuracy(50);
		p.setAddress("29, side layout, cohen 09");
		p.setLanguage("French-IN");
		p.setName("Frontline house");
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite( "http://google.com");
		
		Location l= new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		
	 ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");
		p.setTypes(mylist);
//specbuilders used for repeatative code/common things to specify in one common method
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/").addQueryParam("key", "qaclick123")
		.setContentType(ContentType.JSON).build();
		
		 ResponseSpecification res1 = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		 RequestSpecification res = given().spec(req)
		.body(p);
		
		String response = res.when().post("maps/api/place/add/json")
		.then().spec(res1).extract().response().asString();
		 
		 System.out.println(response);
	}

}
