package asserts;

import io.qameta.allure.Step;

import java.util.List;
import java.util.Set;

/**
 * custom assert
 */
public class Assert {

    @Step("Проверка на ошибку: '{message}'")
    public static void assertTrue(boolean condition, String message){
        org.testng.Assert.assertTrue(condition,message);
    }
    @Step("Проверка на ошибку: '{message}'")
    public static void assertFalse(boolean condition, String message){
        org.testng.Assert.assertFalse(condition,message);
    }

    @Step("Проверка на эквивалентность: '{s1}' с '{s2}'")
    public static void assertEquals(String s1, String s2, String message) {
        org.testng.Assert.assertEquals(s1, s2, message);
    }

    @Step("Проверка на эквивалентность: '{s1}' с '{s2}'")
    public static void assertEqual(String s1, String s2) {
        org.testng.Assert.assertEquals(s1, s2);
    }

    @Step("Проверка на: '{message}'")
    public static void assertNotEquals(int SetAvatars, int ListAvatar, String message) {
        org.testng.Assert.assertNotEquals(SetAvatars, ListAvatar, message);
    }
}