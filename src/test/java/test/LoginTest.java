package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;

public class LoginTest extends TestBase{
    LoginPage loginPage;
    HomePage homePage;

    @Severity(SeverityLevel.CRITICAL)
    @Description("Login with Bug007")
    @Test(priority = 1)
    public void Login () throws InterruptedException {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        loginPage.clickLog();
        loginPage.addUserName("Bug007");
        Thread.sleep(3000);
        loginPage.addPassword("123456");
        loginPage.clickLogInBt();
        Thread.sleep(3000);
        Assert.assertTrue(homePage.successTx.getText().contains("Welcome Bug007"));
    }
}
