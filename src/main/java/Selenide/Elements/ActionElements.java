package Selenide.Elements;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class ActionElements {

    public SelenideElement tipBox = $(Selectors.byId("toolTipButton"));

    public SelenideElement tipText = $(Selectors.byAttribute("aria-describedBy", "buttonToolTip"));

}
