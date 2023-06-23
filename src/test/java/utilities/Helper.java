package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static test.TestBase.driver;

public class Helper {
    private static Helper scrollDown = null;
    private JavascriptExecutor js;

    private Helper() {
        js = (JavascriptExecutor) driver;
    }

    public static synchronized Helper getInstance()
    {
        if (scrollDown == null)
            scrollDown = new Helper();

        return scrollDown;
    }
    public void scrollDown() {
        js.executeScript("scrollBy(0,11000)");
    }
    public void zoomOut() {
        js.executeScript("document.body.style.zoom='70%'");
    }

    // Method to take screen shoot when test case fail

    public void caputreScreenShoot(WebDriver driver, String screenShootName) {

        Path dest = Paths.get("./ScreenShoot/ScreenShoot" + screenShootName + ".png");

        try {
            java.nio.file.Files.createDirectories(dest.getParent());
            FileOutputStream out = new FileOutputStream(dest.toString());
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        } catch (IOException e) {

            System.out.println("Exception while take screen shoot" + e.getMessage());
        }
    }

}