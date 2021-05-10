package Tests;

import DataProviders.UserDataProvider;
import PageObjects.HomePage;
import org.testng.annotations.Test;
import pojo.ProductData;

public class ShoppingCartTest extends BaseTest{

    @Test(groups = {"regression", "sanity"}, dataProvider = "getDataFromJSON", dataProviderClass = UserDataProvider.class)
    public void shouldBeAbletoAddProductToCart(ProductData _ProductData){
        HomePage home = new HomePage(driver);
        home.searchProductByName(_ProductData.getSearchString());

    }
}
