package Selenide.Task4;

import Selenide.Steps.Task4.RobotSteps;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class RobotTest extends RobotSteps {

    RobotSteps steps = new RobotSteps();

    @Test
    public void robotTest() throws InterruptedException {

        open("https://www.google.com");

        Thread.sleep(2000);
        steps.searchArticle();
        Configuration.timeout = 10000;
        steps.clickOnFirstResult();
        Configuration.timeout = 10000;
        steps.newLink();
    }
}
