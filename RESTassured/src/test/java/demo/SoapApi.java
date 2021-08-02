package demo;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static org.hamcrest.Matchers.equalTo;
public class SoapApi 
{
@Test
	public void SoapXML() throws IOException 
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
	statusCode(200).log().all().and().body("//*:AddResult.text()",equalTo("10"));
	}
	
}
