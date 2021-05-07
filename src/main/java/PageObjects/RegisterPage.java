package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends HomePage{

    public RegisterPage(WebDriver driver) {
        super(driver);

    }

    private WebElement firstNameField(){return driver.findElement(By.id("input-firstname"));}

    private WebElement lastNameField(){return driver.findElement(By.id("input-lastname"));}

    private WebElement eMailField(){return driver.findElement(By.id("input-email"));}

    private WebElement telephoneField(){return driver.findElement(By.id("input-telephone"));}

    private WebElement passwordField(){return driver.findElement(By.id("input-password"));}

    private WebElement passwordConfirmField(){return driver.findElement(By.id("input-confirm"));}

    private WebElement agreeCheckBox(){return driver.findElement(By.name("agree"));}

    private WebElement continueButton(){return driver.findElement(By.className("btn btn-primary"));}

    public void registerNewUser(String firstName, String lastName, String eMail, String telephone, String password){
        this.navigateToRegister();
        this.firstNameField().sendKeys(firstName);
        this.lastNameField().sendKeys(lastName);
        this.eMailField().sendKeys(eMail);
        this.telephoneField().sendKeys(telephone);
        this.passwordField().sendKeys(password);
        this.passwordConfirmField().sendKeys(password);
        this.agreeCheckBox().click();
        this.continueButton().click();
    }

}
