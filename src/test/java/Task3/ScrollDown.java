package Task3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class ScrollDown {
    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
