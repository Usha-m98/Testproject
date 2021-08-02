package demo;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;

public class XMLSchemaValidation 
{
@Test
public void XmlSchema() throws IOException
{
	File f= new File("./soaprequest/Add.xml");
	if(f.exists())
		System.out.println(" >>file exists");
     FileInputStream fs=new FileInputStream(f);
     String requestbody=IOUtils.toString(fs,"UTF-8" );
	baseURI="http://www.dneonline.com";
	given().
	contentType("text/xml").
	accept(ContentType.XML).
	body(requestbody).
	when().
	post("/calculator.asmx").
	then().
	statusCode(200).log().all().and().body("//*:AddResult.text()",equalTo("10"))
	.and().assertThat().
	body(RestAssuredMatchers.matchesXsdInClasspath("calculator.xsd"));
}
}
