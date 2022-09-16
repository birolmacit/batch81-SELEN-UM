package EXERCISES;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.accessibility.AccessibleTable;
import java.security.Key;
import java.time.Duration;
import java.util.List;

public class E04_LoginTest {
    /*Class Work: Login Test
1. Bir class oluşturun: LoginTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. http://a.testaddressbook.com adresine gidiniz.
b. Sign in butonuna basin
c. email textbox,password textbox, and signin button elementlerini locate ediniz..
d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
i. Username : testtechproed@gmail.com
ii. Password : Test1234!
e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun.*/

    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver() ;
        driver .manage() .timeouts() .implicitlyWait(Duration.ofSeconds(10) );
        driver .manage() .window() .maximize() ;


        //a. http://a.testaddressbook.com adresine gidiniz.
        driver .get("http://a.testaddressbook.com") ;
        //b. Sign in butonuna basin
        driver .findElement(By.id("sign-in")).click() ;
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        driver .findElement(By.id("session_email")) .sendKeys("testtechproed@gmail.com");
        driver .findElement(By.id("session_password")).sendKeys("Test1234!");
        Actions actions = new Actions(driver );
        actions .sendKeys(Keys.TAB ).sendKeys( Keys.ENTER ) .perform() ;
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun.
       List<WebElement> linkListe=  driver .findElements(By.tagName("a")) ;
        for (WebElement link : linkListe
             ) {
            System.out.println(link );

        }
        System.out.println(linkListe .size() );


Thread .sleep(5000) ;
        driver .close() ;



    }

}
