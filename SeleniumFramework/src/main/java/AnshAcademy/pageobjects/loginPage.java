package AnshAcademy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

    WebDriver driver;

    @FindBy(name = "username")
    WebElement useremail;
    @FindBy(name="password")
    WebElement passwordEle;

    @FindBy(xpath="//div[@class='oxd-form-actions orangehrm-login-action']")
    WebElement submit;

    public void loginApplication(String userName,String password){

        useremail.sendKeys(userName);
        passwordEle.sendKeys(password);
        submit.click();
    }

}
