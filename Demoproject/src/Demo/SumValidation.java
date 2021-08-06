package Demo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class SumValidation {
@Test
public void sumOfcourses()
{
	int sum=0;
	JsonPath js=new JsonPath(Payload.courseprice());
	int count=js.getInt("courses.size()");
	for(int i=0;i<count;i++)
	{
		int price = js.getInt("courses["+i+"].price");
		int copies=js.getInt("courses["+i+"].copies");
		int amount=price*copies;
		System.out.println(amount);
		sum=sum+amount;
		
	}
	System.out.println(sum);
	int purchaseamount=js.getInt("dashboard.purchaseAmount");
	Assert.assertEquals(sum, purchaseamount);
}
	
}
