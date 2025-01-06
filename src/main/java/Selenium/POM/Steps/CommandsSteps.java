package Selenium.POM.Steps;

import Selenium.POM.Elements.CommandsElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CommandsSteps extends CommandsElements {

    WebDriver driver;
    WebDriverWait wait;

    public CommandsSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickEnableButton() {
        WebElement enable = driver.findElement(CommandsElements.enableButton);
        enable.click();
    }

    public void sendTextToInput(String text) {
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(CommandsElements.inputField));
        input.sendKeys(text);
    }

    public void clearInputField() {
        WebElement input = driver.findElement(CommandsElements.inputField);
        input.clear();
    }
    public String getMessageText() {
        WebElement message = driver.findElement(CommandsElements.message);
        return message.getText();
    }
    public int getColumnLocationY(String column) {
        WebElement columnElement = driver.findElement(column.equals("A") ? CommandsElements.columnA : CommandsElements.columnB);
        return columnElement.getLocation().y;
    }
}
