

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8082/Pharmacy_Management/login.jsp");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        //get the total number of link elements
        int totalLinks = allLinks.size();
        System.out.println("total number of links present on the web page is :"+totalLinks);
        int visibleLinkCount = 0;
        int hiddenLinkCount = 0;
        for (WebElement link : allLinks) {
            if (link.isDisplayed()) {
                visibleLinkCount++;
                System.out.println(visibleLinkCount+" --> "+link.getText());
            }else{
                hiddenLinkCount++;
            }
        }
        System.out.println("Total number of visible links :" + visibleLinkCount);
        System.out.println("Total number of hidden links :" + hiddenLinkCount);
        Thread.sleep(5000);
        driver.close();
    }
}
