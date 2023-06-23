package test;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.SignUpPage;

public class RegisterTest extends TestBase{
    SignUpPage signUpPage;
    Faker fakeData = new Faker();
    String firstName = fakeData.name().firstName();
    String lastName =fakeData.name().lastName();

    @Severity(SeverityLevel.CRITICAL)
    @Description("Register New Account")
    @Test(priority = 1)
    public void CreateNewAccount () throws InterruptedException {
        signUpPage = new SignUpPage(driver);
        signUpPage.clickRegister();
        signUpPage.addUserName(firstName + lastName);
        Thread.sleep(3000);
        signUpPage.addPassword("123456");
        signUpPage.clickSignUpBt();
    }
}