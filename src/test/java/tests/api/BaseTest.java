package tests.api;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static specification.Specification.*;

/**
 * base test class
 */
public class BaseTest {

    @BeforeTest
    public void beforeTest() {
        installSpec(requestSpec());
        RestAssured.filters(new AllureRestAssured());
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @AfterTest
    public void afterTest() {
        deletSpec();
    }
}
