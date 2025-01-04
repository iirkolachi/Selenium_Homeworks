package Selenide.Task7;

import Selenide.Steps.Task7.FloatingMenuSteps;
import Selenide.Utils.SetUpClassWithSelenide;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class FloatingMenuTest extends SetUpClassWithSelenide {

    FloatingMenuSteps steps = new FloatingMenuSteps();

    @Test
    public void floatingTest() {
        open("https://the-internet.herokuapp.com/");

        steps.openFloatingMenu();
        steps.scroll();
        steps.menuVisibility();
    }
}
