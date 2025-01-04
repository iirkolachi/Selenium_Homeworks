package Selenide.Steps.Task7;

import Selenide.Elements.Task7.DataTableElements;
import com.codeborne.selenide.SelenideElement;
import java.util.Comparator;
import java.util.List;

public class DataTableSteps extends DataTableElements {

    public void clickDataTable() {
        dataTable.click();
    }

    public void findDoe() {
        System.out.println("There is " + doe.getText() + " in the Table 2.");
    }

    public void findDoesEmail() {
        if(doesEmail.getText().equals("jdoe@hotmail.com")) {
            System.out.println("This is Doe's email address: " + doesEmail.getText());
        } else {
            System.out.println("This is not Doe's email address!");
        }
    }

    public void sortingFirstNames() {
        List<SelenideElement> firstNamesList = firstNames.stream()
                .sorted(Comparator.comparing(SelenideElement::getText))
                .toList();

        String firstNameBeforeClicking = firstNamesList.getFirst().getText();

        firstNameHeader.click();

        if (firstNameBeforeClicking.equals(firstNameValue.getText()))
        {
            System.out.println("Sorting is correct!");
        } else {
            System.out.println("Sorting of First Names did not work!");
        }
    }
}

