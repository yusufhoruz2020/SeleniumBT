package BT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders03_DriverMethods {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:/Users/Sibi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.de/");

        System.out.println(driver.getTitle());

        System.out.println();
        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}
