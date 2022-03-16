package specification;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.*;

/**
 * @return requestSpecification
 */
public class Specification {
    public static RequestSpecification requestSpec() {
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType("application/json")
                .build();
        return requestSpecification;
        }

    /**
     * @return responseSpecification
     */
    public static ResponseSpecification responseSpec(Integer statusCode) {
        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(statusCode)
                .build();
        return responseSpecification;
    }

    /**
     * Install only requestSpecification
     */
    public static void installSpec(RequestSpecification requestSpec) {
        RestAssured.requestSpecification=requestSpec;
    }

    /**
     * Install only responseSpecification
     */
    public static void installSpec(ResponseSpecification responseSpec) {
        RestAssured.responseSpecification=responseSpec;
    }

    /**
     * Install responseSpecification and requestSpecification
     */
    public static void installSpec(RequestSpecification requestSpec, ResponseSpecification responseSpec) {
        RestAssured.requestSpecification=requestSpec;
        RestAssured.responseSpecification=responseSpec;
    }

    /**
     * delete all specification
     */
    public static void deletSpec() {
        RestAssured.requestSpecification=null;
        RestAssured.responseSpecification=null;
    }
}