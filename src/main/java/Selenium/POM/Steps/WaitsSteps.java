package Selenium.POM.Steps;

import Selenium.POM.Elements.WaitsElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class WaitsSteps extends WaitsElements {

    WebDriver driver;
    static WebDriverWait wait;

    public WaitsSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickStart() {
        WebElement startButton = driver.findElement(WaitsElements.startButton);
        startButton.click();
    }

    public void progressBarLoad() {
        WebElement progressBarElement = wait.until(ExpectedConditions.visibilityOfElementLocated(WaitsElements.progressBar));
        wait.until(webDriver -> progressBarElement.getAttribute("aria-valuenow").equals("100"));
        Assert.assertTrue(progressBarElement.getAttribute("aria-valuenow").equals("100"));
    }
}