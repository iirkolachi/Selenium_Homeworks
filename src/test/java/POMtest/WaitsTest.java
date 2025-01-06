package POMtest;

import Selenium.POM.Steps.WaitsSteps;
import Selenium.POM.Utils.SetUpClass;
import org.testng.annotations.Test;

public class WaitsTest extends SetUpClass {

    @Test
    public void waitsTest() {

        WaitsSteps steps = new WaitsSteps(driver);
        driver.get("https://www.google.com");
        driver.navigate().to("https://demoqa.com/progress-bar");

        steps.clickStart();
        steps.progressBarLoad();
    }
}
