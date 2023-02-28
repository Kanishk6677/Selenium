

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Test_9 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://spicejet.com/");

        Thread.sleep(4000);
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        WebElement Submenu=driver.findElement(By.linkText("Benefits"));
        Submenu.click();
        Thread.sleep(4000);
        driver.close();


    }

}
