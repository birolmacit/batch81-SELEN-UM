package EXERCISES;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;
/*1. http://zero.webappsecurity.com/ Adresine gidin
2. Sign in butonuna basin
3. Login kutusuna “username” yazin
4. Password kutusuna “password.” yazin
5. Sign in tusuna basin
6. Pay Bills sayfasina gidin
7. “Purchase Foreign Currency” tusuna basin
8. “Currency” drop down menusunden Eurozone’u secin
9. “amount” kutusuna bir sayi girin
10. “US Dollars” in secilmedigini test edin
11. “Selected currency” butonunu secin
12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.*/

public class E08_DropDown extends TestBase  {
    @Test
    public void test01() {
        //1. http://zero.webappsecurity.com/ Adresine gidin
        driver .get("http://zero.webappsecurity.com/") ;
        //2. Sign in butonuna basin
        driver.findElement(By.xpath("//button[@type='button']")).click() ;

        //3. Login kutusuna “username” yazin
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username") ;

        //4. Password kutusuna “password.” yazin
        //5. Sign in tusuna basin
        Actions actions =new Actions(driver );
        actions .sendKeys(Keys.TAB).sendKeys("password").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER) .perform() ;
        driver.navigate() .back() ;
        driver .findElement(By.xpath("//*[text()='Online Banking']")).click() ;
        //6. Pay Bills sayfasina gidin
        driver .findElement(By.xpath("//*[text()='Pay Bills']")).click() ;
        //7. “Purchase Foreign Currency” tusuna basin
        driver .findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click() ;
        //8. “Currency” drop down menusunden Eurozone’u secin
        Select select =new Select(driver .findElement(By.id("pc_currency")) );
        select .selectByValue("EUR");

        //9. “amount” kutusuna bir sayi girin
        driver .findElement(By.id("pc_amount")).sendKeys("1200");
        //10. “US Dollars” in secilmedigini test edin
        Assert .assertFalse(driver .findElement(By.id("pc_inDollars_true")).isSelected()) ;
        //11. “Selected currency” butonunu secin
        driver .findElement(By.id("pc_inDollars_false")).click() ;
        //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        actions .sendKeys(Keys.TAB ) .sendKeys(Keys.ENTER).sendKeys(Keys.TAB ) .sendKeys(Keys.ENTER).perform() ;
        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.
    }
}
