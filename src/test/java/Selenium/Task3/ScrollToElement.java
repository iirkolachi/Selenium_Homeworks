package Selenium.Task3;

import Selenium.POM.Utils.SetUpClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ScrollToElement extends SetUpClass {
    @Test
    public void main() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");
        WebElement submit = driver.findElement(By.id("submit"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submit);
        Thread.sleep(2000);
        Assert.assertTrue(submit.isDisplayed(),"Submit should be displayed.");
        System.out.println("'Submit' has been displayed!");

        driver.quit();
    }
}
