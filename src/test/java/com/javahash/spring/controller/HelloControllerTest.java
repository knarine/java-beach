package com.javahash.spring.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.AssertionErrors;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static com.jayway.restassured.RestAssured.given;

public class HelloControllerTest {
	
	//Todo: make this work later
	/*@Before public void 
	given_rest_assured_is_configured_with_greeting_controller() {
	    RestAssuredMockMvc.standaloneSetup(new HelloWorldController());   
	}

	@Test
	public void hello_world_resource_returns_expected_greeting_in_body(){
		given().
        	when().
        get("/hello").
        	then().                 
        body("content", equalTo("Hello : Kalisha"));
	}*/
	
	@Test
	public void very_simple_unit_test(){
		String result = "one" + "two";
		assertEquals("onetwo", result);
	}

}
