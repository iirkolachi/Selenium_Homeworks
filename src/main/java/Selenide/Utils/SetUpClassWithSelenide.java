package Selenide.Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetUpClassWithSelenide {

    @BeforeTest
    public void setUpMethod() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }
    @AfterTest
    public void quit() {
        Selenide.closeWebDriver();
    }
}