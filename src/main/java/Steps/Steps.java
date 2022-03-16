package Steps;

import asserts.Assert;
import data.*;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static io.restassured.RestAssured.given;
import static specification.Specification.*;

/**
 * steps for testing
 */
public class Steps {

    @Step("Проверка уникальности аватаров пользователей")
    public static void usersSecondPage() {
        installSpec(responseSpec(200));
        Resourse response = given()
                .get("api/users?page=2")
                .then()
                .extract().body().as(Resourse.class);
        Set<String> newExpected = new HashSet<>(response.replaseAvatars(response.getData()));
        Assert.assertNotEquals(newExpected.size(), response.replaseAvatars(response.getData()).size(),
                "Аватары не уникальны");
    }

    @Step("Корректный вход в систему")
    public static void trueAutorizationUsers(String email, String password) {
        installSpec(responseSpec(200));
        Autorizations autorizations = new Autorizations(email, password);
        AutorizationCreated autorizationCreated = given()
                .log().all()
                .body(autorizations)
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .log().all()
                .extract().body().as(AutorizationCreated.class);
        Assert.assertTrue(autorizationCreated.getToken() != null, "Не найден токен");
    }

    @Step("Проверка на провальный логин без пароля")
    public static void falseAutorizationUsers(String email) {
        installSpec(responseSpec(400));
        Autorizations autorizations = new Autorizations(email);
        AutorizationCreated autorizationCreated = given()
                .log().all()
                .body(autorizations)
                .when()
                .post("api/login")
                .then()
                .log().all()
                .extract().body().as(AutorizationCreated.class);
        Assert.assertEquals(autorizationCreated.getError(), "Missing password", "Вход выполнен без пароля");
    }

    @Step("Проверка на сортировку по годам")
    public static void sortedYearListResource() {
        installSpec(responseSpec(200));
        ResourseList responce = given()
                .when()
                .get("api/unknown")
                .then()
                .extract().body().as(ResourseList.class);
        Assert.assertTrue(responce.sortList(responce.getDatalist()),
                "Массив не отсортирован по по возрастанию, по годам");
    }
}
