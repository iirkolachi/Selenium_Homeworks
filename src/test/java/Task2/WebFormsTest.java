package Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class WebFormsTest {
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        driver.navigate().to("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
        dropdown.click();
        WebElement language = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']/option[@value='c#']"));
        language.click();
        System.out.println("Is any programming language selected? " + language.isSelected());

        List <WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkboxes']"));
        for (WebElement checkbox : checkboxes) {
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
        System.out.println("All checkboxes is checked now!");

        WebElement color = driver.findElement(By.xpath("//input[@type='radio' and @name='color' and @value='yellow']"));
        color.click();
        System.out.println("Is yellow selected? " + color.isSelected());

        WebElement disabled = driver.findElement(By.xpath("//select[@id='fruit-selects']"));
        disabled.click();
        WebElement orange = driver.findElement(By.xpath("//option[@disabled='disabled']"));
        System.out.println("Is orange enabled? " + orange.isEnabled());

        driver.quit();
    }
}
