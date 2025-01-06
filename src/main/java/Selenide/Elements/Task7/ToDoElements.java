package Selenide.Elements.Task7;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class ToDoElements {

    public SelenideElement toDo = $(Selectors.byAttribute("href", "To-Do-List/index.html"));

    public SelenideElement add = $(Selectors.byXpath("//*[@id=\"container\"]/input"));

    public SelenideElement newList = $(Selectors.byXpath("//*[@id=\"container\"]/ul"));

    public SelenideElement secondTask = $(Selectors.byXpath("//*[@id=\"container\"]/ul/li[2]"));

    public SelenideElement deleteButton = $(Selectors.byXpath("//*[@id=\"container\"]/ul/li[2]/span/i"));

    //*[@id="container"]/ul

}