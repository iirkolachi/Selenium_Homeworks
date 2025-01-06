package Selenium.Task4;

import Selenium.POM.Utils.SetUpClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class WebTables extends SetUpClass {
    @Test
    public void main() {

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
