package POMtest;

import Selenium.POM.Elements.CommandsElements;
import Selenium.POM.Steps.CommandsSteps;
import Selenium.POM.Utils.SetUpClass;
import org.testng.annotations.Test;

public class CommandsTest extends SetUpClass {

    @Test
    public void commandsTest() {

        CommandsSteps steps = new CommandsSteps(driver);
        driver.get("https://www.google.com");
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");

        steps.clickEnableButton();
        steps.sendTextToInput("Bootcamp");
        System.out.println("Input text is: " + driver.findElement(CommandsElements.inputField).getAttribute("value"));

        steps.clearInputField();

        System.out.println("Message text: " + steps.getMessageText());

        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        int locationA = steps.getColumnLocationY("A");
        int locationB = steps.getColumnLocationY("B");
        System.out.println("Y location of A is" + locationA + ", like Y location of B - " + locationB);
    }
}
