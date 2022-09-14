package EXERCISES;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;
/*1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
4.https://www.walmart.com/ sayfasina gidin.
5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
6. Tekrar “facebook” sayfasina donun
7. Sayfayi yenileyin
8. Sayfayi tam sayfa (maximize) yapin
9.Browser’i kapatin*/

public class E03_Manage_navigation extends TestBase  {
    @Test
    public void test(){
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        driver .navigate().to("https://www.facebook.com");
        Assert.assertFalse(driver .getTitle().equals("“facebook”") ) ;


        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //Assert .assertTrue("title facebook icermiyor",driver .getTitle().contains("facebook") );
        Assert .assertFalse("title facebook icermiyor",driver .getTitle().contains("facebook") ) ;
        //yazdirin.
        //4.https://www.walmart.com/ sayfasina gidin.
        driver .get("https://www.walmart.com/") ;
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
       // Assert.assertEquals("Walmart.com",driver .getTitle());
        //6. Tekrar “facebook” sayfasina donun
        driver .navigate() .back() ;

        //7. Sayfayi yenileyin
        driver .navigate() .refresh() ;
        //8. Sayfayi tam sayfa (maximize) yapin
        driver .manage() .window() .minimize() ;
        //9.Browser’i kapatin


    }
}
