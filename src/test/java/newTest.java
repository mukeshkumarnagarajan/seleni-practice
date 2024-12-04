import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTest {
    public static void main(String[] args) {
        System.out.println("Welcome to the chrom test");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://google.com");
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }

    }

}
