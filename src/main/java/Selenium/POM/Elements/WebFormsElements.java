package Selenium.POM.Elements;

import org.openqa.selenium.By;

public class WebFormsElements {

    public static By dropdown = By.xpath("//select[@id='dropdowm-menu-1']");
    public static By language = By.xpath("//select[@id='dropdowm-menu-1']/option[@value='c#']");
    public static By checkboxes = By.xpath("//div[@id='checkboxes']");
    public static By color = By.xpath("//input[@type='radio' and @name='color' and @value='yellow']");
    public static By disabled = By.xpath("//select[@id='fruit-selects']");
    public static By orange = By.xpath("//option[@disabled='disabled']");
}
