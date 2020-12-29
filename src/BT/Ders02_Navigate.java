package BT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders02_Navigate {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:/Users/Sibi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("https://youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
