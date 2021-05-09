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
        this.loginOption().click();
    }

    public void navigateToRegister(){this.registerOption().click();}

    public void searchProductByName(String productName){
        this.searchField().sendKeys(productName);
        this.searchButton().click();
    }
}
