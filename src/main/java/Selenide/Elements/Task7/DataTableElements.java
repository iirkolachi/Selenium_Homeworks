package Selenide.Elements.Task7;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DataTableElements {

    public SelenideElement dataTable = $(Selectors.byAttribute("href", "/tables"));

    public SelenideElement doe = $(Selectors.byXpath("//*[@id=\"table2\"]/tbody/tr[3]/td[1]"));

    public SelenideElement doesEmail = $(Selectors.byXpath("//*[@id=\"table1\"]/tbody/tr[3]/td[3]"));

    public ElementsCollection firstNames = $$(Selectors.byXpath("//*[@id='table2']/tbody/tr[1]/td[2] | " +
            "//*[@id='table2']/tbody/tr[2]/td[2] | " +
            "//*[@id='table2']/tbody/tr[3]/td[2] | " +
            "//*[@id='table2']/tbody/tr[4]/td[2]"));

    public SelenideElement firstNameHeader = $(Selectors.byXpath("//*[@id=\"table2\"]/thead/tr/th[2]/span"));

    public SelenideElement firstNameValue = $(Selectors.byXpath("/html/body/div[2]/div/div/table[2]/tbody/tr[1]/td[2]"));



}

