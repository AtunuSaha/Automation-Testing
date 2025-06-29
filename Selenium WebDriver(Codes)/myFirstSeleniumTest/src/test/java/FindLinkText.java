import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");
      //  driver.findElement(By.partialLinkText("Auth")).click();
      //  driver.findElement(By.partialLinkText("JavaScript onload")).click();
      //  Thread.sleep(4000);
      //  driver.navigate().back();
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
      //  driver.findElement(By.className("radius")).click();
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
