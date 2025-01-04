package Selenide.Steps.Task7;

import Selenide.Elements.Task7.FloatingMenuElements;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;

public class FloatingMenuSteps extends FloatingMenuElements {

    public void openFloatingMenu() {
        floatingMenu.click();
    }

    public void scroll() {
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void menuVisibility() {
        menu.shouldBe(visible);
    }
}
