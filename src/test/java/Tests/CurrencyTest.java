package Tests;

import DataProviders.UserDataProvider;
import PageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.CurrencyData;

public class CurrencyTest extends BaseTest{ //autor:  Juan Gutiérrez

    @Test(groups = {"regression", "sanity"}, dataProvider = "getCurrencyFromJSON", dataProviderClass = UserDataProvider.class)
    public void pricesDiplayedDollars(CurrencyData _CurrencyData){
        HomePage home = new HomePage(driver);
        home.toggleCurrency(_CurrencyData.getCurrency());
        Boolean rightCurrency = true;
        for (String currency : home.getCurrencyList()){
            if(!currency.equals(_CurrencyData.getCurrency())){
                rightCurrency = false;
            }
        }
        Assert.assertTrue(rightCurrency, "Currencies don't Match!");
    }
}
