import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTest {
    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\thinkpad\\projects\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://endava.com");
        driver.findElement(By.id("onetrust-reject-all-handler")).click();
        driver.findElement(By.id("menu-open-icon")).click();
        driver.findElement(By.id("hs_cos_wrapper_Lets_Connect_button")).click();
        String phoneNumber = driver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_Contact_us_hero_module\"]/div/div/div/div[2]/div/div[2]/span")).getText();
        System.out.println("Endava's phone number is: " + phoneNumber);

        Thread.sleep(1500);
        driver.quit();

    }
}