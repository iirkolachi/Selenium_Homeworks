package Selenium.Task4;

import Selenium.POM.Utils.SetUpClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;


public class RobotTest extends SetUpClass {
    @Test
    public void main() throws InterruptedException, AWTException {

        Robot robot = new Robot();

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
