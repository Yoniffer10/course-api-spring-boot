package com.inlakech.springboot.app.test;


import static io.restassured.RestAssured.given;

import org.springframework.http.HttpStatus;
import org.testng.annotations.Test;

public class TopicServiceTest extends FunctionalBaseTest {

	@Test(enabled=false)
	public void makeSureThatCoreApiIsUp() {
		given().when().get("/hello").then().assertThat().statusCode(HttpStatus.OK.value());
	}
}
