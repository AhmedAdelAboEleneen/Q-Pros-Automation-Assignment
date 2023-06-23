package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.Helper;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void startDriver(@Optional("edge") String browserName)  throws Exception{

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Link
        driver.navigate().to("https://www.demoblaze.com/index.html");

    }

    @AfterTest
    public void stopDriver() {

         driver.quit();
    }

    // Take Screenshot when test case fail and add it in screenshot folder
    @AfterMethod
    public void screenShootsOnFailure(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            System.out.println("Failed!");
            System.out.println("Taking ScreenShot.......");
            Helper.getInstance().caputreScreenShoot(driver, result.getName());

        }
    }
}
