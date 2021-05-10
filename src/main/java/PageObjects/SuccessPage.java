package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessPage extends BasePage{ //autor:  Juan Gutiérrez

    public SuccessPage(WebDriver driver) {
        super(driver);

    }

    private WebElement sucessMessage(){
        return driver.findElement(By.xpath("//title"));
    }

    public WebElement messageTitle(){
        return driver.findElement(By.id("content"));
    }

    public WebElement successDisplayed(){
        return driver.findElement(By.id("common-success"));
    }
}

