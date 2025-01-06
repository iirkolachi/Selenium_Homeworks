package POMtest;

import Selenium.POM.Steps.WebFormsSteps;
import Selenium.POM.Utils.SetUpClass;
import org.testng.annotations.Test;

public class WebFormsTest extends SetUpClass {

    @Test
    public void webFormsTest() throws InterruptedException {

        WebFormsSteps steps = new WebFormsSteps(driver);
        driver.get("https://www.google.com");
        driver.navigate().to("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        steps.clickDropdown();
        steps.clickLanguage();
        steps.checkboxesSelection();
        steps.colorClick();
        steps.checkDisable();
        steps.checkColor();
    }
}
