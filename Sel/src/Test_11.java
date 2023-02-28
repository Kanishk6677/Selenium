
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test_11 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.freecrm.com/"); //enter URL
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("kanakraj55266255@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Knkraj52625@");
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
        Thread.sleep(3000);

        driver.switchTo().frame("mainpanel");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/span")).click();



    }

}
