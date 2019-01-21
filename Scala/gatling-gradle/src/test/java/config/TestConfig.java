package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;

/**
 * Created by david on 4/8/2018.
 */
public class TestConfig {


    @BeforeClass
    public static void setup(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port=8080;
        RestAssured.basePath="/app/";

        RestAssured.proxy("localhost",8888);

    }

}
