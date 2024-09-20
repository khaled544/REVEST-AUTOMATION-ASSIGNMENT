package APITests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class TestExample1 {
	
	
	@Test
	public void test() {
		
		
		Response response = get("https://jsonplaceholder.typicode.com/posts");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getHeader("Content-type"));
		
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	public void test2() {
		
		baseURI = "https://jsonplaceholder.typicode.com/posts";
		given().
			get(baseURI).
		then().
			statusCode(200).body("id[1]", equalTo(2));
	}
	
	

}
