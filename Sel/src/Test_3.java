
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Test_3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8082/Pharmacy_Management/login.jsp");
        WebElement KeepMeLogIN_Checkbox =driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/label"));
        Thread.sleep(2000);
        KeepMeLogIN_Checkbox.click();
        if (KeepMeLogIN_Checkbox.isSelected()) {
            System.out.println("Checkbox is selected");
        }else{
            System.out.println("Checkbox is NOT selected");
        }

        Thread.sleep(2000);
        driver.close();
    }

}
