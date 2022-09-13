package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    /*
    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    Delete butonu’nun gorunur oldugunu test edin
    Delete tusuna basin
    “Add/Remove Elements” yazisinin gorunur oldugunu test edin

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        // Delete butonu’nun gorunur oldugunu test edin
        // Delete tusuna basin
        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
    }
}
