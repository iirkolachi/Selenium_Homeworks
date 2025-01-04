package Selenide.Elements.Task7;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class FloatingMenuElements {

    public SelenideElement floatingMenu = $(Selectors.byAttribute("href","/floating_menu"));

    public SelenideElement menu = $(Selectors.byAttribute("href","#home"));
}
