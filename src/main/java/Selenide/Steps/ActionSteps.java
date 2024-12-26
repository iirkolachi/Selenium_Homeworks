package Selenide.Steps;

import Selenide.Elements.ActionElements;
import com.codeborne.selenide.Condition;

public class ActionSteps extends ActionElements {

    public ActionSteps scrollToTipbox() {
        tipBox.scrollTo();
        return this;
    }
    public void hoverTipbox() {
        tipBox.shouldBe(Condition.visible);
        tipBox.hover();
    }
    public boolean tipTextIsDisplayed() {
        tipText.shouldBe(Condition.visible);
        return tipText.isDisplayed();
    }
}
