package Selenium.Task4;

import Selenium.POM.Utils.SetUpClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ActionTest extends SetUpClass {
    @Test
    public void main() throws InterruptedException {

        Actions action = new Actions(driver);

        driver.get("https://www.google.com");
        driver.navigate().to("https://demoqa.com/tool-tips");

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