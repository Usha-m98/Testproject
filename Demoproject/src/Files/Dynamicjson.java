package Files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Dynamicjson {
	
	//add book
	
	@Test(dataProvider="Booksdata")
	public void addbook(String isbn,String aisle)
	

	{
		RestAssured.baseURI="http://216.10.245.166/";
	String response=given().log().all().header("Content-Type","application/json").
			body(Payload.AddBook(isbn,aisle))
		.when().
		post("Library/Addbook.php").
		then()
		.log().all().assertThat().
		statusCode(200).extract().response().asString();
	
	JsonPath js=Methods.rawTojson(response);
	String id=js.get("ID");
	System.out.println(id);
	
	}
	
	//delete book
	
	
	@DataProvider(name="Booksdata") // providing the data sets using dataprovider
	public Object[][] getData()
	{
		return new Object[][] {{"abcd","2292"},{"abcd","2294"},{"abcd","2295"} };
	}
	
	

}
