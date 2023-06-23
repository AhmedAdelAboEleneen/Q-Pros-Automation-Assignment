package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageBase{

    // Catch sign in nav button element
    @FindBy(id = "signin2")
    private WebElement registerBt;

    // Catch username text element
    @FindBy(id = "sign-username")
    private WebElement userNameTx;

    // Catch password text element
    @FindBy(id = "sign-password")
    private WebElement passwordTx;

    // Catch sign in view button element
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    private WebElement signUpBt;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }
    public void clickRegister (){
        registerBt.click();
    }

    public void addUserName(String name){
        userNameTx.sendKeys(name);
    }

    public void addPassword(String password){
        passwordTx.sendKeys(password);
    }
    public void clickSignUpBt (){
        signUpBt.click();
    }
}
