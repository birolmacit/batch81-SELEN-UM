package EXERCISES;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;
//● Bir class oluşturun: DropDown
//● https://the-internet.herokuapp.com/dropdown adresine gidin.
//1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
//2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
//3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
//4.Tüm dropdown değerleri(value) yazdırın
//5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse
//False yazdırın.

public class E07_Dropdown extends TestBase {
    @Test
    public void testDropdown() {
        //● Bir class oluşturun: DropDown
//● https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver .get("https://the-internet.herokuapp.com/dropdown") ;

        WebElement dropdownButton= driver .findElement(By.xpath("//select[@id='dropdown']"));
        Select option= new Select(dropdownButton);
        option.selectByIndex(1);
        System.out.println(option.getFirstSelectedOption().getText() );

        option .selectByValue("2");
        System.out.println(option.getFirstSelectedOption().getText() );

//1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
//2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
//3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
//4.Tüm dropdown değerleri(value) yazdırın
        System.out.println(option.getOptions());
        List<WebElement > dropdownelemanlari=option .getOptions();
        System.out.println(dropdownelemanlari.size() );
//5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse
//False yazdırın.
    }
}
