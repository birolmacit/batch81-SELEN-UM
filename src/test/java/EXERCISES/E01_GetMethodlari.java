package EXERCISES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

/*1. Yeni bir package olusturalim : day01
2. Yeni bir class olusturalim : C03_GetMethods
3. Amazon sayfasina gidelim. https://www.amazon.com/
4. Sayfa basligini(title) yazdirin
5. Sayfa basliginin “Amazon” icerdigini test edin
6. Sayfa adresini(url) yazdirin
7. Sayfa url’inin “amazon” icerdigini test edin.
8. Sayfa handle degerini yazdirin
9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
10. Sayfayi kapatin.*/

public class E01_GetMethodlari {
    public static void main(String[] args) {
        System .setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver() ;
        driver .manage() .timeouts() .implicitlyWait(Duration.ofSeconds(10) ) ;
        driver .manage() .window() .maximize() ;


        //1. Yeni bir package olusturalim : day01
        //2. Yeni bir class olusturalim : C03_GetMethods
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver .get("https://www.amazon.com");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        if(driver .getTitle() .contains("Amazon") ){
            System.out.println("title test passed");
        }
        else {
            System.out.println("title test failed");
        }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver .getCurrentUrl());

        //7. Sayfa url’inin “amazon” icerdigini test edin.
        if(driver .getCurrentUrl().contains("amazon")){
            System.out.println("url test passed");
        }
        else {
            System.out.println("url test failed");
        };
        //8. Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandle());
        Set<String > handledegerleri= driver .getWindowHandles();
        for (String s : handledegerleri){
            System.out.println(s);
        }



        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        System.out.println(driver .getPageSource() .contains("alisveris")?"alisveris kelimesini iceriyor":"alisveris kelimesi icermiyor");

        //10. Sayfayi kapatin.
        driver .close() ;

    }
}
