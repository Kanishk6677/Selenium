
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_7 {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        String title = driver.getTitle();

        System.out.println(title);

        //validation point:
        if(title.equals("Google")){
            System.out.println("correct title");
        }
        else{
            System.out.println("in-correct title");
        }


        System.out.println(driver.getCurrentUrl());

        //System.out.println(driver.getPageSource());

        driver.quit(); //quit the browser

    }

}
