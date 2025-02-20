package testing;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TGetMethod01 {
    @Description("TestCase01---verify getRequest method- 1")
    @Test
    public void getRequest1(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get()
                .then().statusCode(201);
    }
    @Description("TestCase01---verify getRequest method- 2")
    @Test
    public void getRequest2(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get()
                .then().statusCode(201);
    }
    @Description("TestCase01---verify getRequest method- 3")
    @Test
    public void getRequest3(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get()
                .then().statusCode(201);
    }
}


