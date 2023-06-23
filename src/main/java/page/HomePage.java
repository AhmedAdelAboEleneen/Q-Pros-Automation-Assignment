package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    // Catch success text element
    @FindBy(id = "nameofuser")
    public WebElement successTx;

    // Catch samsung value element
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    private WebElement samsungGalaxyTx;

    // Catch add samsung to cart element
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    private WebElement addSamsungGalaxyTx;

    // Catch cart button element
    @FindBy(id = "cartur")
    private WebElement cartBt;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickSamsung (){
        samsungGalaxyTx.click();
    }

    public void addSamsung (){
        addSamsungGalaxyTx.click();
        addSamsungGalaxyTx.sendKeys(Keys.ENTER);
    }

    public void clickCart (){
        cartBt.click();
    }

}
