package PageObjects;

import PageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement loginOption() {
        return driver.findElement(By.xpath("//div[@id='top-links']//li[@class='dropdown open']//*[text() = 'Login']"));
    }

    private WebElement myAccount(){
        return driver.findElement(By.xpath("//div[@id='top-links']//ul[@class='list-inline']//li[@class='dropdown']"));
    }

    private WebElement CurrencyButton(){
        return driver.findElement(By.xpath("//div[@class='pull-left']//div[@class='btn-group']//button[@class='btn btn-link dropdown-toggle']"));
    }

    private WebElement currencyButton(String currency){
        return driver.findElement(By.name(currency));
    }

    private WebElement registerOption() {
        return driver.findElement(By.xpath("//div[@id='top-links']//li[@class='dropdown open']//*[text() = 'Register']"));
    }

    private WebElement shoppingCart() {
        return driver.findElement(By.className("fa fa-shopping-cart"));
    }

    private WebElement searchField() {
        return driver.findElement(By.name("search"));
    }

    private WebElement searchButton() {
        return driver.findElement(By.className("btn btn-default btn-lg"));
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
        this.currencyButton(currency).click();
    }

    public void searchProductByName(String productName){
        this.searchField().sendKeys(productName);
        this.searchButton().click();
    }
}
