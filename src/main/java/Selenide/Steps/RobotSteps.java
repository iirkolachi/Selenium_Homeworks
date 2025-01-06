package Selenide.Steps;

import Selenide.Elements.RobotElements;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.actions;

public class RobotSteps extends RobotElements {

    public void searchArticle() {
        search.setValue("Selenium Robot Class example").pressEnter();
    }
    public void clickOnFirstResult() throws InterruptedException {
        while (!firstResult.has(Condition.focused)) {
            actions().sendKeys(Keys.TAB).perform();
            Thread.sleep(200);
        }
        firstResult.pressEnter();
    }
    public void newLink() {
        String initialUrl = WebDriverRunner.url();
        firstResult.pressEnter();
        $("header").shouldBe(Condition.visible);
        String newUrl = WebDriverRunner.url();
        Assert.assertNotEquals(initialUrl,newUrl);
    }
}
