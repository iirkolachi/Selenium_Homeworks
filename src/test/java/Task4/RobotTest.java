package Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class RobotTest {
    @Test
    public void main() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Robot robot = new Robot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        search.sendKeys("Selenium Robot Class example");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement firstResult = driver.findElement(By.xpath("//a[h3]"));
        while (!firstResult.equals(driver.switchTo().activeElement())) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(200);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(200);

        String newPage = driver.getCurrentUrl();
        Assert.assertNotSame(firstResult.toString(),newPage);
        System.out.println("Enjoy the Selenium Robot Class example!");

        driver.quit();
    }
}
