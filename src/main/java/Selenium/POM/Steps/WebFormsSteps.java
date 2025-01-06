package Selenium.POM.Steps;

import Selenium.POM.Elements.WebFormsElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class WebFormsSteps extends WebFormsElements {

    WebDriver driver;

    public WebFormsSteps(WebDriver driver) {
        this.driver = driver;
    }
    public void clickDropdown() {
        WebElement dropdown = driver.findElement(WebFormsElements.dropdown);
        dropdown.click();
    }
    public void clickLanguage() {
        WebElement language = driver.findElement(WebFormsElements.language);
        language.click();
    }
    public void checkboxesSelection() {
        List<WebElement> checkboxes = driver.findElements(WebFormsElements.checkboxes);
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }
    }
    public void colorClick() {
        WebElement color = driver.findElement(WebFormsElements.color);
        color.click();
        Assert.assertTrue(color.isSelected(),"color should be selected");
    }
    public void checkDisable() {
        WebElement disabled = driver.findElement(WebFormsElements.disabled);
        disabled.click();
    }
    public void checkColor() {
        WebElement orange = driver.findElement(WebFormsElements.orange);
        orange.isEnabled();
    }
}
