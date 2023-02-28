

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));
        int username_width = unTB.getSize().getWidth();
        System.out.println(username_width);
        WebElement mobileNumTB =driver.findElement(By.xpath("//*[@id=\"email\"]"));
        int mobNumWidth = mobileNumTB.getSize().getWidth();
        System.out.println(mobNumWidth);
        if (username_width==mobNumWidth) {
            System.out.println("Size of Both username and password fields are same"
                    +username_width+" = " + mobNumWidth);
        }else{
            System.out.println("Size of username and password fields are NOT same that is :" +username_width+" Not equals to " + mobNumWidth);




            Thread.sleep(5000);
            driver.quit();
            // TODO Auto-generated method stub

        }}

}
