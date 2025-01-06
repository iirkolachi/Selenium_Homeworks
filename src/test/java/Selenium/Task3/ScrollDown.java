package Selenium.Task3;

import Selenium.POM.Utils.SetUpClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ScrollDown extends SetUpClass {
    @Test
    public void main() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long initialPosition = (Long) js.executeScript("return window.pageYOffset;");

        for (int i = 0; i < 4; i++) {
            System.out.println("Page position after scroll " + (i + 1) + " is " + initialPosition);
            js.executeScript("window.scrollTo(0, " + (initialPosition + (i + 1) * 500) + ");");
            Thread.sleep(2000);
            long newPosition = initialPosition + 500L;

            Assert.assertTrue(newPosition > initialPosition, "Page position should have changed after scroll.");
            initialPosition = newPosition;
        }
        System.out.println("Page location has changed successfully!");

        driver.quit();
    }
}
