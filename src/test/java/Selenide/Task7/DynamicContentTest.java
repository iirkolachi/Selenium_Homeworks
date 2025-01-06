package Selenide.Task7;

import Selenide.Steps.Task7.DynamicContentSteps;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class DynamicContentTest {

    DynamicContentSteps steps = new DynamicContentSteps();

    @Test
    public void dynamicTest() throws InterruptedException {
        open ("https://the-internet.herokuapp.com/");

        steps.openDynamicContent();
        steps.refreshPage();
        Thread.sleep(3000);
    }
}
