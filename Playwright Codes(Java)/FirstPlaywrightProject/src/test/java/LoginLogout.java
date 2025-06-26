import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class LoginLogout {
    public static void main(String[] args) throws InterruptedException {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(100));
        Page page = browser.newPage();

        page.navigate("https://the-internet.herokuapp.com/login");
        PlaywrightAssertions.assertThat(page).hasTitle("The Internet");

     //   page.locator("#email1").fill("admin1@gmail.com");
          page.locator("//input[@id='username']").fill("tomsmith");
          page.locator("//input[@id='password']").fill("SuperSecretPassword!");

          //     page.locator("css=input[name='email1']").fill("admi1@gmail.com");
         // page.getByPlaceholder("Enter Email").fill("admin@email.com");
        //  page.getByPlaceholder("Enter Password").fill("admin@123");
          page.locator("//i[@class='fa fa-2x fa-sign-in']").click();


          Thread.sleep(2000);
          page.close();
          browser.close();
    }
}
