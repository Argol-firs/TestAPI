package tests.api;


import Steps.Steps;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * main test class
 */
public class APITests extends BaseTest{

    @DataProvider(name = "loginDataProvider")
    public Object[][] getData() {
    Object[][] data = {{"eve.holt@reqres.in", "cityslicka"}};
        return data;
    }

    @DataProvider(name = "falseDataProvider")
    public Object[][] forLoggin() {
        Object[][] data = {{"eve.holt@reqres.in"}};
        return data;
    }

    @Test
    public void mainTest() {
        Steps.usersSecondPage();
    }

    @Test(dataProvider = "loginDataProvider")
    public void tLoginTest(String email, String password) {
        Steps.trueAutorizationUsers(email, password);
    }

    @Test(dataProvider = "falseDataProvider")
    public void fLoginTest(String email) {
        Steps.falseAutorizationUsers(email);
    }

    @Test
    public void sortYear() {
        Steps.sortedYearListResource();
    }
}
