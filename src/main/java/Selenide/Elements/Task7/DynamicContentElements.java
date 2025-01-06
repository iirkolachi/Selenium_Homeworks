package Selenide.Elements.Task7;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class DynamicContentElements {

    public SelenideElement dynamicContent = $(Selectors.byAttribute("href","/dynamic_content"));

    public SelenideElement refreshButton = $(Selectors.byAttribute("href", "/dynamic_content?with_content=static"));

    public SelenideElement content = $(Selectors.byXpath("//*[@id=\"content\"]"));
}
