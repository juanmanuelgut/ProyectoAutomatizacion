package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private WebElement productName() {
        return driver.findElement(By.xpath("//div[@class='table-responsive']//table[@class='table table-bordered']//tbody//tr//td[2]"));
    }

    public WebElement shoppingCartTitle(){
        return driver.findElement(By.xpath("//div[@id='content']//h1"));
    }

    public String strProductName() {
        String productName = this.productName().getText();
        return productName;
    }


}
