package Selenide.Steps.Task7;

import Selenide.Elements.Task7.DynamicContentElements;

public class DynamicContentSteps extends DynamicContentElements {

    public void openDynamicContent() {
        dynamicContent.click();
    }

    public void refreshPage() {
        String beforeRefresh = content.text();

        for (int i = 0; i < 3; i++ ) {
            refreshButton.click();

            String afterRefresh = content.text();

        if (!beforeRefresh.equals(afterRefresh)) {
            System.out.println("Content has been changed!");
        } else {
            System.out.println("Content has not been changed!");
        }

            beforeRefresh = afterRefresh;
        }
    }
}
