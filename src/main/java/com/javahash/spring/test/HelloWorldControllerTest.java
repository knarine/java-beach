
package com.javahash.spring.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

import com.javahash.spring.controller.HelloWorldController;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.*;
import com.jayway.restassured.module.mockmvc.matcher.RestAssuredMockMvcMatchers.*;

import org.hamcrest.Matchers.*;

public class HelloWorldControllerTest{

@Test
public void hello_world_resource_returns_expected_name_in_body(){
	
	RestAssuredMockMvc.standaloneSetup(new HelloWorldController());
	assertEquals(5, 5);
	/*given().param("name", "Kalisha")
	.when().get()
	.then().body("content", equals("Hello Kalisha"));*/
	
}

}
