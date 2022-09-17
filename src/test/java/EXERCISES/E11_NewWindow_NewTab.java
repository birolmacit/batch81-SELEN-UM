package EXERCISES;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

//● Yeni bir class olusturun: WindowHandle
//● Amazon anasayfa adresine gidin.
//● Sayfa’nin window handle degerini String bir degiskene atayin
//● Sayfa title’nin “Amazon” icerdigini test edin
//● Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
//● Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
//● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
//● Sayfa title’nin “Walmart” icerdigini test edin
//● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
public class E11_NewWindow_NewTab extends TestBase {
    @Test
    public void test(){

        //● Yeni bir class olusturun: WindowHandle
        //● Amazon anasayfa adresine gidin.
        driver .get("https://www.amazon.com") ;
        //● Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonHandleDegeri=driver.getWindowHandle() ;
        //● Sayfa title’nin “Amazon” icerdigini test edin
        Assert.assertTrue(driver .getTitle().contains("Amazon") );
        //● Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        driver .switchTo() .newWindow(WindowType.TAB) .get("https://www.techproeducation.com") ;

        //● Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver .getTitle().contains("Techpro Education") );
        //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver .switchTo() .newWindow(WindowType.WINDOW).get("https://www.wallmart.com") ;
        //● Sayfa title’nin “Walmart” icerdigini test edin
        Assert.assertTrue(driver .getTitle().contains("Walmart") ) ;
        //● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver .switchTo() .window(amazonHandleDegeri );
    }
}
