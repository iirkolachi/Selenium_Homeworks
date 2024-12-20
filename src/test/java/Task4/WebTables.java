package Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebTables {
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        driver.navigate().to("https://the-internet.herokuapp.com/tables");

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
        boolean randomGuy = false;
        String name;
        for (WebElement row : rows) {
            name = row.findElement(By.xpath("./td[2]")).getText();
            String balance = row.findElement(By.xpath("./td[4]")).getText();
            System.out.println("Name: " + name + ", " + "Balance: " + balance);
            if (name.equals("Frank")) {
                randomGuy = true;
            }
        }
        Assert.assertTrue(randomGuy, "There is no Frank in the list!");
        System.out.println("Frank was found!");

        driver.quit();
    }
}
