package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CartPage;
import page.HomePage;

public class CreateOrderTest extends TestBase {
    HomePage homePage;
    CartPage cartPage;

    @Severity(SeverityLevel.CRITICAL)
    @Description("Add Samsung")
    @Test(priority = 1)
    public void AddSamsungToCart() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickSamsung();
        Thread.sleep(3000);
        homePage.addSamsung();
        driver.navigate().to("https://www.demoblaze.com/cart.html#");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Delete Item from cart")
    @Test(priority = 2)
    public void DeleteSamsungFromCart() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.clickDelete();
        Thread.sleep(3000);
        Assert.assertTrue(cartPage.totalTx.getText().contains("360"));
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Place Order")
    @Test(priority = 3)
    public void PlaceOrder() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.clickPlaceOrder();
        cartPage.addName("test");
        cartPage.addCountry("egypt");
        cartPage.addCity("Alexandria");
        cartPage.addCard("4242424242424242");
        cartPage.addMonth("06");
        cartPage.addYear("2026");
        cartPage.clickPurchase();
        Thread.sleep(5000);
        Assert.assertTrue(cartPage.thankYouTx.getText().contains("Thank you for your purchase!"));
        cartPage.clickOk();
    }
}
