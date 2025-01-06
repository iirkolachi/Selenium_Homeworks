package Selenide.Steps.Task4;

import Selenide.Elements.Task4.WebtablesElements;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

public class WebtablesSteps extends WebtablesElements {

    public void takeNamesAndBalances() {
        String name = null;
        String balance = null;

        boolean randomGuy = false;

        for (SelenideElement row : rows) {
            name = row.$("td:nth-child(2)").getText();
            balance = row.$("td:nth-child(4)").getText();

            System.out.println("Name: " + name + ", Balance: " + balance);


            assert name != null;
            if (name.equals("Frank")) {
                randomGuy = true;
            }
        }
        Assert.assertTrue(randomGuy, "There is no Frank in the list!");
        System.out.println("Frank was found!");
    }
}
