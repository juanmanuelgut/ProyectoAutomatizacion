package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage{ //autor:  Juan Gutiérrez

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchPageContentHeader(){
        return driver.findElement(By.xpath("//div[@id='content']//h1"));
    }

    private WebElement addCartButton(){
        return driver.findElement(By.xpath("//div[@class='product-thumb']//div[@class='button-group']//button//i[@class='fa fa-shopping-cart']"));
    }

    public WebElement cartSuccessRibbon(){
        return driver.findElement(By.xpath("//div[@id='product-search']//div[@class='alert alert-success alert-dismissible']"));
    }

    public void addProductToCart(){
        this.addCartButton().click();
    }
}
