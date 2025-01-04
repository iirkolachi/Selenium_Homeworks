package Selenide.Task4;

import Selenide.Steps.Task4.WebtablesSteps;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class WebTablesTest {

    WebtablesSteps steps = new WebtablesSteps();

    @Test
    public void webtablesTest() {
        open("https://the-internet.herokuapp.com/tables");

        steps.takeNamesAndBalances();
    }
}
