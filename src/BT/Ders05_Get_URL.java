package BT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ders05_Get_URL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Sibi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://youtube.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


       String str = driver.getCurrentUrl();







       kelimeURLicindevarmi(str, "tube");


       driver.navigate().to("https://ebay.com");

        String title = driver.getTitle();
        wordTitleIcindeVarMi(title,"cars");

        driver.quit();







    }

    public static void kelimeURLicindevarmi(String url,String kelime) {


        if (url.toLowerCase().contains(kelime.toLowerCase())) {
            System.out.println(url + " " + kelime + " iceriyor");
        } else {
            System.out.println(url + " " + kelime + " icermiyor");
        }


    }

    public static void wordTitleIcindeVarMi(String title,String word){
        if (title.toLowerCase().contains(word.toLowerCase())) {
            System.out.println(title + " " + word + " iceriyor");
        } else {
            System.out.println(title + " " + word + " icermiyor");
        }
    }





}
