package Selenium.Task3;

import Selenium.POM.Utils.SetUpClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class AssertsTest extends SetUpClass {
        @Test
        public void main() {

            driver.get("https://www.google.com");
            driver.navigate().to("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

            WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
            dropdown.click();
            WebElement language = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']/option[@value='c#']"));
            language.click();
            Assert.assertTrue(language.isSelected(), "Programming language C# should be selected!");
            System.out.println("Programming language has been selected correctly!");

            List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkboxes']"));
            for (WebElement checkbox : checkboxes) {
                if(!checkbox.isSelected()){
                    checkbox.click();
                }
            }
            for (WebElement checkbox : checkboxes) {
                Assert.assertFalse(checkbox.isSelected(),"All checkboxes should be selected!");
            }
            System.out.println("All of the checkboxes are checked one-by-one!");

            WebElement color = driver.findElement(By.xpath("//input[@type='radio' and @name='color' and @value='yellow']"));
            color.click();
            Assert.assertTrue(color.isSelected(),"Yellow should be selected!");
            System.out.println("Yellow has been selected!");

            WebElement disabled = driver.findElement(By.xpath("//select[@id='fruit-selects']"));
            disabled.click();
            WebElement orange = driver.findElement(By.xpath("//option[@disabled='disabled']"));
            Assert.assertFalse(orange.isEnabled(),"Orange should be disabled!");
            System.out.println("Orange is disabled!");

            driver.quit();
    }
}