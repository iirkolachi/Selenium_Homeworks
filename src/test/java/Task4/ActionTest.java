package Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionTest {
    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        driver.navigate().to(" https://demoqa.com/tool-tips");

        WebElement tipBox = driver.findElement(By.id("toolTipButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", tipBox);
        action.moveToElement(tipBox).perform();
        Thread.sleep(2000);

        WebElement tipText = driver.findElement(By.className("tooltip-inner"));
        Assert.assertTrue(tipText.isDisplayed());

        driver.quit();
    }
}