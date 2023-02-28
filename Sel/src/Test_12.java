
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_12 {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");

        driver.switchTo().frame(0);//switch to frame if its present

        Actions action = new Actions(driver);

        action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
                .release()
                .build()
                .perform();

        Thread.sleep(3000);
        driver.quit(); //quit the browser

    }

}
