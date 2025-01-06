package Selenide.Task7;

import Selenide.Steps.Task7.ToDoSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ToDoTest extends ToDoSteps {

    @Test
    public void toDoTest() throws InterruptedException {
        open("https://webdriveruniversity.com/");

        clickToDoList();
        switchToNewTab();
        Thread.sleep(2000);
        clickAdd();
        Thread.sleep(2000);
        check();
        deleteSecondTask();
        Thread.sleep(2000);
        checkRemainingTasks();
    }
}
