package Selenide.Elements.Task4;

import Selenide.Utils.SetUpClassWithSelenide;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class RobotElements extends SetUpClassWithSelenide {

    public SelenideElement search = $(Selectors.byId("APjFqb"));

    public SelenideElement firstResult = $(Selectors.byXpath("//a[h3]"));

}
