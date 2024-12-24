package Selenium.POM.Elements;

import org.openqa.selenium.By;

public class WaitsElements {

    public static By startButton = By.xpath("//*[@id='startStopButton']");
    public static By progressBar = By.xpath("//div[@role='progressbar' and @aria-valuenow='100']");
}
