package EXERCISES;

import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class E10_Iframe extends TestBase {
    @Test
    public void test() throws InterruptedException {
        //● Bir class olusturun: IframeTest02
        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver .get("http://demo.guru99.com/test/guru99home/") ;
       String birincisayafahandle= driver .getWindowHandle();

        //2) sayfadaki iframe sayısını bulunuz.
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement iframepenceresi=driver .findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RbSlW8jZFe8']"));
        driver .switchTo() .frame(iframepenceresi ) ;
        driver .findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click() ;
        Thread .sleep(5000) ;
        driver .findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click() ;

        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver .switchTo() .defaultContent() ;

        //5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html)
        //tıklayınız
        driver .switchTo() .frame(driver .findElement(By.xpath("//iframe[@id='a077aa5e']")));
        driver .findElement(By.xpath("//img[@src='Jmeter720.png']")).click() ;
        driver .switchTo() .parentFrame() ;


        Set<String > handledegerleriset=driver.getWindowHandles();
        String ikincisayfaHandle="";
        for (String each : handledegerleriset ) {
            if (!each.equals(birincisayafahandle) ) {
                ikincisayfaHandle =each;


            }

        }
        driver .switchTo() .window(ikincisayfaHandle );

        driver .findElement(By.xpath("//a[@class='button-liveproject']")).click() ;
    }

}
