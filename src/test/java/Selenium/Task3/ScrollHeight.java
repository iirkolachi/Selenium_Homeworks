package Selenium.Task3;

import Selenium.POM.Utils.SetUpClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ScrollHeight extends SetUpClass {
    @Test
    public void main() throws InterruptedException {

        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);
        WebElement footer = driver.findElement(By.xpath("/html/body/div/footer"));
        Assert.assertTrue(footer.isDisplayed(), "Footer should be visible after scrolling.");
        System.out.println("Good job! Page has been scrolled to the footer!");

        driver.quit();
    }
}
