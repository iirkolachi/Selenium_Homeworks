package Selenide.Steps.Task7;

import Selenide.Elements.Task7.ToDoElements;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static com.codeborne.selenide.Selenide.switchTo;

public class ToDoSteps extends ToDoElements {

    public void clickToDoList() {
        toDo.click();
    }

    public void switchToNewTab() {
        switchTo().window("WebDriver | To Do List");
    }

    public void clickAdd() {
        List<String> toDos = new ArrayList<>();
        toDos.add("Finish homeworks");
        toDos.add("Buy presents");
        toDos.add("Work");

        for (int i = 0; i < 3; i++) {
            add.setValue(toDos.get(i));
            add.pressEnter();
        }
    }

    public void check() {
        List<String> allTasks = Collections.singletonList(newList.getText());
        System.out.println("New tasks are added: " + allTasks);
    }

    public void deleteSecondTask() {
        secondTask.hover();
        deleteButton.click();
    }

    public void checkRemainingTasks() {
        List<String> remainingTasks = Collections.singletonList(newList.getText());
        System.out.println("Remaining tasks: " + remainingTasks);
    }
}
