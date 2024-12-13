import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class WaitsTest {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

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
