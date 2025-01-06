package Selenium.Task2;

import Selenium.POM.Utils.SetUpClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;


public class WaitsTest extends SetUpClass {
    @Test
    public void main() {

        driver.get("https://www.google.com");
        driver.navigate().to("https://demoqa.com/progress-bar");
        WebElement start = driver.findElement(By.xpath("//*[@id='startStopButton']"));
        start.click();

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement progressBar = explicitWait.until(webDriver -> webDriver.findElement(By.xpath
                ("//div[@role='progressbar' and @aria-valuenow='100']")));
        System.out.println("The progress bar has reached " + progressBar.getAttribute("aria-valuenow") + "%!");

        driver.quit();
    }
}
