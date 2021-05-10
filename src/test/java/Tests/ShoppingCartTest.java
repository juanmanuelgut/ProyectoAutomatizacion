package Tests;

import DataProviders.UserDataProvider;
import PageObjects.HomePage;
import PageObjects.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.ProductData;

public class ShoppingCartTest extends BaseTest{

    @Test(groups = {"regression", "sanity"}, dataProvider = "getProductsFromJSON", dataProviderClass = UserDataProvider.class)
    public void shouldBeAbletoAddProductToCart(ProductData _ProductData){
        HomePage home = new HomePage(driver);
        home.searchProductByName(_ProductData.getSearchString());
        SearchResultsPage results = new SearchResultsPage(driver);
        results.waitUntilElementExists(results.searchPageContentHeader());
        results.addProductToCart();
        results.implicitWait(5);
        Assert.assertTrue(results.cartSuccessRibbon().getText().contains("Success"),"Adding Product to cart was unsuccessful");
    }
}
