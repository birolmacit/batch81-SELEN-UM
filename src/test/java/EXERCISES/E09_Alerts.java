package EXERCISES;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
/*● Bir class olusturun: Alerts
● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
● Bir metod olusturun: acceptAlert
○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
“You successfully clicked an alert” oldugunu test edin.
● Bir metod olusturun: dismissAlert
○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
“successfuly” icermedigini test edin.
● Bir metod olusturun: sendKeysAlert
○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.*/

public class E09_Alerts extends TestBase  {
    @Test
    public void test01() {
        //● Bir class olusturun: Alerts

        //● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
        driver .get("https://the-internet.herokuapp.com/javascript_alerts") ;
        driver .findElement(By.xpath("//*[text()='Click for JS Alert']")).click() ;
        //● Bir metod olusturun: acceptAlert
        acceptAlert();
        //○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        //“You successfully clicked an alert” oldugunu test edin.
        Assert .assertEquals("You successfully clicked an alert",driver .findElement(By.id("result")) .getText()) ;
        //● Bir metod olusturun: dismissAlert
        driver .findElement(By.xpath("//*[text()='Click for JS Confirm']")).click() ;
        dismissAlert();
        //○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        //“successfuly” icermedigini test edin.
        //● Bir metod olusturun: sendKeysAlert
        driver .findElement(By.xpath("//*[text()='Click for JS Prompt']")).click() ;
        driver .switchTo() .alert() .sendKeys("birol");
        driver .switchTo() .alert() .accept() ;
        //○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
        //tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
    }

    private void dismissAlert() {
        driver .switchTo() .alert() .dismiss() ;
    }

    private void acceptAlert() {

        driver .switchTo().alert() .accept() ;
    }
}
