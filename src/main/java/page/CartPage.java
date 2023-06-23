package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

    // Catch delete button element
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")
    private WebElement deleteBt;

    // Catch total amount text element
    @FindBy(id = "totalp")
    public WebElement totalTx;

    // Catch place order button element
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
    private WebElement placeOrderBt;

    // Catch name text element
    @FindBy(id = "name")
    private WebElement nameTx;

    // Catch country text element
    @FindBy(id = "country")
    private WebElement countryTx;

    // Catch city text element
    @FindBy(id = "city")
    private WebElement cityTx;

    // Catch card text element
    @FindBy(id = "card")
    private WebElement cardTx;

    // Catch month text element
    @FindBy(id = "month")
    private WebElement monthTx;

    // Catch year text element
    @FindBy(id = "year")
    private WebElement yearTx;

    // Catch purchase button element
    @FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    private WebElement purchaseBt;

    // Catch thank you text element
    @FindBy(xpath = "/html/body/div[10]/h2")
    public WebElement thankYouTx;

    // Catch ok button element
    @FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
    public WebElement okBt;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickDelete (){
        deleteBt.click();
    }
    public void clickPlaceOrder (){
        placeOrderBt.click();
    }
    public void addName(String name){
        nameTx.sendKeys(name);
    }
    public void addCountry(String country){
        countryTx.sendKeys(country);
    }

    public void addCity(String city){
        cityTx.sendKeys(city);
    }

    public void addCard(String card){
        cardTx.sendKeys(card);
    }

    public void addMonth(String month){
        monthTx.sendKeys(month);
    }

    public void addYear(String year){
        yearTx.sendKeys(year);
    }

    public void clickPurchase(){
        purchaseBt.click();
    }
    public void clickOk(){
        okBt.click();
    }
}
