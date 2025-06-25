import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class myClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
       // String pagesource = driver.getPageSource();
     //   String googlehandle = driver.getWindowHandle();
      //  System.out.println("page source: " + googlehandle);

        String googleTitle = driver.getTitle();
        System.out.println("The title of Google is: " + googleTitle);
        driver.navigate().to("https://www.udemy.com");
        String udemyTitle = driver.getTitle();
        System.out.println("The title of Udemy is: " + udemyTitle);
        driver.navigate().back();
        driver.getCurrentUrl();
        String googleurl = driver.getCurrentUrl();
        System.out.println("The google url is: " + googleurl);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.navigate().forward();
        Thread.sleep(1000);

        driver.quit();
    }
}
