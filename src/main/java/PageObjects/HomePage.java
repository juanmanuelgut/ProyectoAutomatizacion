package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ArrayList;

public class HomePage extends BasePage  {//autor:  Juan Gutiérrez

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement loginOption() {
        return this.driver.findElement(By.xpath("//div[@id='top-links']//li[@class='dropdown open']//*[text() = 'Login']"));
    }

    private WebElement myAccount(){
        return driver.findElement(By.xpath("//div[@id='top-links']//ul[@class='list-inline']//li[@class='dropdown']"));
    }

    private WebElement CurrencyButton(){
        return driver.findElement(By.xpath("//div[@class='pull-left']//div[@class='btn-group']//button[@class='btn btn-link dropdown-toggle']"));
    }

    private WebElement selectedCurrencyButton(String currency){
        return driver.findElement(By.name(currency));
    }

    private WebElement registerOption() {
        return driver.findElement(By.xpath("//div[@id='top-links']//li[@class='dropdown open']//*[text() = 'Register']"));
    }

    private List<WebElement> displayedPrices(){
        List<WebElement> displayedPrices = driver.findElements(By.xpath("//div[@class='product-layout col-lg-3 col-md-3 col-sm-6 col-xs-12']//div[@class='product-thumb transition']//div[@class='caption']//p[@class='price']"));
        return displayedPrices;
    }

    private WebElement shoppingCart() {
        return driver.findElement(By.className("fa fa-shopping-cart"));
    }

    private WebElement searchField() {
        return driver.findElement(By.name("search"));
    }

    private WebElement searchButton() {
        return driver.findElement(By.xpath("//div[@class='input-group']//span[@class='input-group-btn']//button[@class='btn btn-default btn-lg']"));
    }

    public void navigateToLogin(){
        this.myAccount().click();
        this.loginOption().click();
    }

    public void navigateToRegister(){
        this.myAccount().click();
        this.registerOption().click();
    }

    public void toggleCurrency(String currency){
        this.CurrencyButton().click();
        this.selectedCurrencyButton(currency).click();
    }

    public ArrayList<String> getCurrencyList(){
        ArrayList<String> currencyList = new ArrayList<String>();
        for (WebElement price : this.displayedPrices()){
            String strPrice = price.getText();
            if (Character.isDigit(strPrice.charAt(0))){
                currencyList.add("EUR");
            } else if (strPrice.charAt(0) == '$'){
                currencyList.add("USD");
            }else {
                currencyList.add("GBP");
            }
        }
        return currencyList;
    }

    public void searchProductByName(String productName){
        this.searchField().sendKeys(productName);
        this.searchButton().click();
    }
}
