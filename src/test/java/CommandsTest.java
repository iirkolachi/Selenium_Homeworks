import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;


public class CommandsTest {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.google.com");
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement enable = driver.findElement(By.xpath("//button[text()='Enable']"));
        enable.click();

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement input = explicitWait.until(webDriver -> webDriver.findElement(By.xpath("//*[@id='input-example']//input")));
        WebElement message = driver.findElement(By.id("message"));

        System.out.println("Is input field enabled? " + input.isEnabled());
        System.out.println("Wow, " + message.getText());
        System.out.println("The Enable button is " + enable.getText() + " button now.");

        input = explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
                                                                                                    //"//*[@id='input-example']//input"
        Thread.sleep(2000); //სრედები უბრალოდ დავამატე, ძაან სწრაფად რომ არ ემუშავა და დამენახა, რას აკეთებდა :დ
        input.sendKeys("Bootcamp");
        System.out.println("Input text is " + input.getAttribute("value"));
        Thread.sleep(2000);
        input.clear();

        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(2000);
        int locationA = driver.findElement(By.id("column-a")).getLocation().y;
        int locationB = driver.findElement(By.id("column-b")).getLocation().y;
        System.out.println("Y location of A is " + locationA + ", like Y location of B - " + locationB);

        driver.quit();
    }
}
