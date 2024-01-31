package api.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.Endpoints.CreateUser;
import api.Payload.UserLoginPojo;
import io.restassured.response.Response;

public class UserLoginTests {
	
	 @Test(dataProvider = "UserData", dataProviderClass=api.utility.DataProviders.class)
public void testPostUser(String userName,String pwd)
	
	{
	 UserLoginPojo loginPayload= new UserLoginPojo();
	 
	 loginPayload.setUserName(userName);
	 loginPayload.setPassword(pwd);
		 
	 Response response=CreateUser.postUser(loginPayload);
     Assert.assertEquals(response.getStatusCode(), 201);
	 
	 
	}

	
	
}
