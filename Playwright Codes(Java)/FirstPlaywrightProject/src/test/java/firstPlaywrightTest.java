import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class firstPlaywrightTest {
    public static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        BrowserType browserType = pw.chromium();
      //  BrowserType browserType = pw.webkit();

        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));

        Page page = browser.newPage();
        page.navigate("https://www.google.com");
        String pagetitle = page.title();
        System.out.println("The title of the page is: " +pagetitle);

        Thread.sleep(3000);
        page.close();
        browser.close();
        pw.close();
    }
}
