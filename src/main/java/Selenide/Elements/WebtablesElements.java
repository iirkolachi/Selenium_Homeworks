package Selenide.Elements;

import Selenide.Utils.SetUpClassWithSelenide;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import static com.codeborne.selenide.Selenide.$$;

public class WebtablesElements extends SetUpClassWithSelenide {

    public ElementsCollection rows = $$(Selectors.byXpath("//*[@id='table1']/tbody/tr"));
}
