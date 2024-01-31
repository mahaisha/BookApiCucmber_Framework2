package api.utility;

import java.util.ResourceBundle;

import api.Payload.UserLoginPojo;
import io.restassured.response.Response;


public class CommonUtils {
	
	public static ResourceBundle endpoints = ResourceBundle.getBundle("endpoint");
	
	
	public static UserLoginPojo loginPojo = new UserLoginPojo();
	public static Response response;
	
}
