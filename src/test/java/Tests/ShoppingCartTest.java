package Tests;

import DataProviders.UserDataProvider;
import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.ProductData;

public class ShoppingCartTest extends BaseTest{ //autor:  Juan Gutiérrez

    @Test(groups = {"regression", "sanity"}, dataProvider = "getProductsFromJSON", dataProviderClass = UserDataProvider.class)
    public void shouldBeAbletoAddProductToCart(ProductData _ProductData){
        HomePage home = new HomePage(driver);
        home.searchProductByName(_ProductData.getSearchString());
        SearchResultsPage results = new SearchResultsPage(driver);
        results.waitUntilElementExists(results.searchPageContentHeader());
        results.addProductToCart();
        results.implicitWait(5);
        results.waitUntilElementExists(results.cartSuccessRibbon());
        results.openShoppingCart();
        CartPage cart = new CartPage(driver);
        cart.waitUntilElementExists(cart.shoppingCartTitle());
        Assert.assertTrue(cart.strProductName().contains(_ProductData.getSearchString()), "Producto no añadido al Carrito");
    }
}
