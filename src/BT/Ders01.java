package BT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders01 {

    public static void main(String[] args) {


        // Java projemize chromedirver i tanittik
        System.setProperty("webdriver.chrome.driver","C:/Users/Sibi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://google.com");
        webDriver.navigate().to("https://amazon.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();

       // webDriver.close();

    }

}
