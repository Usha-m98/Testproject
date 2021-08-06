package Demo;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class complexjsonparse {

	public static void main(String[] args) 
	{

  JsonPath js=new JsonPath(Payload.courseprice());
   //print No of courese returned by API
  
  int count=js.getInt("courses.size()");
  System.out.println(count);
  
  //Print Purchase amount
  int amount= js.getInt("dashboard.purchaseAmount");
  System.out.println(amount);
  
  //print title of the first course
  String title=js.get("courses[2].title");
  System.out.println(title);
  
//Print All course titles and their respective Prices
  for(int i=0;i<count;i++)
  {
 String titles=js.get("courses["+i+"].title");
 System.out.println(titles);
 System.out.println(js.get("courses["+i+"].price").toString()); //to print without assign to a variable
 }
  
//Print no of copies sold by RPA Course
  System.out.println("print no of copies sold by RPA");
  
  for(int i=0;i<count;i++)
  {
	  String coursetitle=js.get("courses["+i+"].title");
	  if(coursetitle.equalsIgnoreCase("RPA"))
	  {
		  //copies sold
		  int copies=js.get("courses["+i+"].copies");
		  System.out.println(copies);
		  break;
	  }
  }
  
  
	}
}
