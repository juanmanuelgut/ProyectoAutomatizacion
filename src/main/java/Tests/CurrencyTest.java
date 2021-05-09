package Tests;

import DataProviders.UserDataProvider;
import PageObjects.HomePage;
import org.testng.annotations.Test;
import pojo.CurrencyData;

public class CurrencyTest extends BaseTest{

    @Test(groups = {"regression", "sanity"}, dataProvider = "getCurrencyFromJSON", dataProviderClass = UserDataProvider.class)
    public void pricesDiplayedDollars(CurrencyData _CurrencyData){
        HomePage home = new HomePage(driver);
        home.toggleCurrency(_CurrencyData.getCurrency());
        
    }
}
