package api.Endpoints;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import org.testng.annotations.BeforeClass;

import api.Payload.UserLoginPojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUser {
	
static ResourceBundle getURL()
		
		{
		ResourceBundle endpoints= ResourceBundle.getBundle("endpoint"); //Load properties file
			return endpoints;
		}
		
		  @BeforeClass
		    public void setUp() {
		        String baseUrl = getURL().getString("baseurl");
		        RestAssured.baseURI = baseUrl;
		    }

		
	public static Response postUser(UserLoginPojo payload)
	{
		
		String postUserUrl=getURL().getString("postUserUrl");
		
	Response response=given()
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body(payload)
	
	.when()
	.post(postUserUrl);
	
	
	return response;
	
}	
}	

