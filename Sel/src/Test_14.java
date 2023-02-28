
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_14 {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actimind.com/");
        WebElement menu=driver.findElement(By.xpath("/html/body/header/div/div/div/nav/ul/li[2]/a"));
        Actions action=new Actions(driver);
        action.moveToElement(menu).perform();
        WebElement submenu=driver.findElement(By.xpath("/html/body/header/div/div/div/nav/ul/li[2]/ul/li/ul/li[2]/a"));
        action.moveToElement(submenu).click().perform();
        driver.quit(); //quit the browser

    }

}
