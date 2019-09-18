
import org.openqa.selenium.Webdriver;
import org.openqa.selenium.suppirt.ui.Webdriverwati;


public class second {

    private Webdriver driver;
    private WebdriverWait wait;

    @Before
    public void start () {
        driver = new Chromedriver();
        wait = new Webdriverwait (driver,timeOutSeconds 10 );
    }
}
    @Test
     public void second () {
    driver.get("https://bash.im/search");
    driver.findElement(By.name("text")).sendKeys ("1");
    driver.findElement(By.targname ("button")).click();
    driver.until(titleIs("Цитата №1 -Цитатник Рунета"));
    }
   @After
   public void stop() {
    driver.quit();
    driver = null;
   }

}