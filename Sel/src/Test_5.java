
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_5 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8082/Pharmacy_Management/login.jsp");
        WebElement UN = driver.findElement(By.id("username"));
        if (UN.isEnabled()) {
            System.out.println("Username text box is enabled");
        }else {
            System.out.println("Username text box is disabled");
        }
        Thread.sleep(3000);
        driver.close();

    }

}
