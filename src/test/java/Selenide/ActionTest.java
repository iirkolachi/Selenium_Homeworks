package Selenide;

import Selenide.Steps.ActionSteps;
import Selenide.Utils.SetUpClassWithSelenide;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class ActionTest extends SetUpClassWithSelenide {

    ActionSteps steps = new ActionSteps();

    @Test
    public void actionTest() throws InterruptedException {

        open("https://demoqa.com/tool-tips");

        Configuration.timeout = 20000;
        Thread.sleep(3000);
        steps.scrollToTipbox()
                .hoverTipbox();
        Assert.assertTrue(steps.tipTextIsDisplayed());

        Thread.sleep(3000);
    }
}
