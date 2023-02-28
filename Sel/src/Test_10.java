
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test_10 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://www.google.com ");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
        Thread.sleep(2000);
        List<WebElement> allOptions =driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
        int count = allOptions.size();
        System.out.println("Number of values present in the dropdown is : " + count);
        String expectedValue="selenium interview questions";
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(" "+text);
            //Click on Java Interview Questions
            if (text.equalsIgnoreCase(expectedValue)) {
                option.click();
                break;


            }
        }
    }

}
