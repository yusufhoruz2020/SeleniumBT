package BT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders04_IfElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Sibi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        String sayfaBasligi = driver.getTitle();
        if (sayfaBasligi.toLowerCase().contains("Books")){
            System.out.println(sayfaBasligi + "  'Books' iceriyor");
        }else{
            System.out.println(sayfaBasligi +"  'Books' icermiyor");
        }

        driver.quit();
    }
}
