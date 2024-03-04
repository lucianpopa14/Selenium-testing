import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTest {
    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\thinkpad\\IdeaProjects\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://endava.com");
        driver.findElement(By.id("onetrust-reject-all-handler")).click();
        WebElement menu = driver.findElement(By.id("menu-open-icon"));
        menu.click();
        WebElement contactForm = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/bq-button"));
        contactForm.click();
        WebElement phoneNumber = driver.findElement(By.xpath("/html/body/div[2]/div/div/section[1]/div/div/div/div[2]/div/div[2]/span"));
        System.out.println(phoneNumber.getText());

        Thread.sleep(5000);
        driver.quit();

    }
}