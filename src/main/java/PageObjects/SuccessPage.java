package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessPage extends BasePage{

    public SuccessPage(WebDriver driver) {
        super(driver);

    }

    private WebElement sucessMessage(){return driver.findElement(By.xpath("//title"));}

    public String successString(){

        return this.sucessMessage().getText();

    }
}
