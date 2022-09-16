package EXERCISES;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
/*CheckBox
1. Bir class oluşturun : CheckBoxTest
2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
a. Verilen web sayfasına gidin.
https://the-internet.herokuapp.com/checkboxes
b. Checkbox1 ve checkbox2 elementlerini locate edin.
c. Checkbox1 seçili değilse onay kutusunu tıklayın
d. Checkbox2 seçili değilse onay kutusunu tıklayın*/

public class E05_CheckBox extends TestBase {
    @Test
    public void test(){
        //1. Bir class oluşturun : CheckBoxTest
        //2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        //a. Verilen web sayfasına gidin.
        driver .navigate() .to("https://the-internet.herokuapp.com/checkboxes");
        //https://the-internet.herokuapp.com/checkboxes
        //b. Checkbox1 ve checkbox2 elementlerini locate edin.
        if((!driver .findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected())){
            driver .findElement(By.xpath("(//input[@type='checkbox'])[1]")).click() ;
        }

        if((!driver .findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected())){
            driver .findElement(By.xpath("(//input[@type='checkbox'])[2]")).click() ;
        }
        //c. Checkbox1 seçili değilse onay kutusunu tıklayın
        //d. Checkbox2 seçili değilse onay kutusunu tıklayın*/

    }

}
