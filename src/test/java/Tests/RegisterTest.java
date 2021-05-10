package Tests;

import DataProviders.UserDataProvider;
import PageObjects.RegisterPage;
import PageObjects.SuccessPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.RegisterData;

public class RegisterTest extends BaseTest{
    @Test(groups = {"regression", "sanity"}, dataProvider = "getDataFromJSON", dataProviderClass = UserDataProvider.class)
    public void ShouldBeAbleToRegister(RegisterData _RegisterData) throws InterruptedException {
        RegisterPage register = new RegisterPage(driver);
        //register.implicitWait(30);
        register.registerNewUser(_RegisterData.getFirstName(), _RegisterData.getLastName(), _RegisterData.makeEmailUnique(_RegisterData.getEmail()), _RegisterData.getTelephone(), _RegisterData.getPassword());
        SuccessPage result = new SuccessPage(driver);
        result.waitUntilElementExists(result.messageTitle());
        Assert.assertEquals(result.successDisplayed().isDisplayed(),true);
    }
}
