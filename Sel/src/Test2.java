
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("KANAK");
        Thread.sleep(2000);
        String value = driver.findElement(By.id("email")).getAttribute("value");
        System.out.println("Value present inside the text box is : "+value);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Kanak_raj");
        Thread.sleep(2000);

        driver.quit();
        // TODO Auto-generated method stub

    }

}
