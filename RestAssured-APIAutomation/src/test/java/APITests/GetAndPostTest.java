package APITests;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
public class GetAndPostTest {
	
	//@Test
	public void testGet() {
		
	
		baseURI = "https://jsonplaceholder.typicode.com";
		
		given().
			get("/posts").
		then().
			statusCode(200).
			body("id[1]", equalTo(2)).
			body("title[1]",equalTo("qui est esse"));
	}
	@Test
	public void testPost() {
		
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("userId", 30);
//		map.put("id", 999);
//		map.put("title", "my title for sample post on the jsonpalceholder");
//		map.put("body", "my title for sample post on the jsonpalceholder");
		
		
		//System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("userId", 30);
		request.put("title", "my title for sample post on the jsonpalceholder");
		request.put("body", "my body for sample post on the jsonpalceholder");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://jsonplaceholder.typicode.com";
		
		given().
		contentType(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/posts").
		then().
			statusCode(201).log().all().assertThat().
			  body("id", notNullValue()).
	          body("userId", equalTo(30)).
	          body("title", equalTo("my title for sample post on the jsonpalceholder")).
	          body("body", equalTo("my body for sample post on the jsonpalceholder"));
}
	}
		
