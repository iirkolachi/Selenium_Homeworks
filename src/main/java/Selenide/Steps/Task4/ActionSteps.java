package Selenide.Steps.Task4;

import Selenide.Elements.Task4.ActionElements;
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
