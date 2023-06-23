package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    // Catch login in nav button element
    @FindBy(id = "login2")
    private WebElement logBt;

    // Catch username text element
    @FindBy(id = "loginusername")
    private WebElement userNameTx;

    // Catch password text element
    @FindBy(id = "loginpassword")
    private WebElement passwordTx;

    // Catch login in view button element
    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    private WebElement logInBt;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void clickLog (){
        logBt.click();
    }

    public void addUserName(String name){
        userNameTx.sendKeys(name);
    }

    public void addPassword(String password){
        passwordTx.sendKeys(password);
    }
    public void clickLogInBt (){
        logInBt.click();
    }
}
