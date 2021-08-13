package pojo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.awt.List;
import java.util.ArrayList;

import Files.Payload;
import io.restassured.RestAssured;

public class serializetest {

	public static void main(String[] args) {
	   //Google maps-Add api	
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		
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

		String res = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(p).
		when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		 
		 System.out.println(res);
	}

}


/*Serialization: converting java object to Request body(payload)
Deserialization: converting Response body back to java object
Design approach-
1.Java object is constructed with the help of POJO classes
2.POJO classes are created based on the request/Response payload*/