package Selenide.Task7;

import Selenide.Steps.Task7.DataTableSteps;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class DataTableTest extends DataTableSteps {

    @Test
    public void dataTableTest() {
        open("https://the-internet.herokuapp.com/");

        clickDataTable();
        findDoe();
        findDoesEmail();
        sortingFirstNames();
    }
}
