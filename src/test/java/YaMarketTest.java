import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YaMarketTest {
    @Test
    public void marketTest(){
        System.setProperty("webdriwer.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://market.yandex.ru/");
        //driver.get("https://market.yandex.ru/product--braslet-xiaomi-mi-band-4-nfc/471443054?hid=10498025&rt=4&suggest_text=Xiaomi%20Mi%20Band%204%20NFC&suggest=1&suggest_type=model&suggest_reqid=85128892874921400087423712896832");
        driver.get("https://www.eldorado.ru/cat/detail/71512688");
        driver.findElement(By.partialLinkText("миллионов")).sendKeys("123");
        WebElement element = driver.findElement(By.className("catalogItemDetailHd"));
        //WebElement element = driver.findElement(By.partialLinkText("Избранное"));
        //String prod = element.getAttribute("name");
        //System.out.println(prod);
        driver.findElement(By.linkText("Добавить в корзину")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(By.linkText("Перейти в корзину")).click();
        //wait = new WebDriverWait(driver, 5);
        //element.sendKeys("GILLETTE");

        //driver.findElement(By.id("btnSrch")).click();
        //WebElement element = driver.findElement(By.className("btn-wishlist-link  "));
        //element.findElement(By.cssSelector("/wishlist/index/")).click();
        //element.sendKeys("13.3\" Ноутбук Apple MacBook Air (MQD32RU/A) серебристый");
        //driver.findElement(By.className("search2__button")).click();
        //String product = driver.findElement(By.className("title title_size_28 title_bold_yes")).toString();
        //driver.findElement(By.partialLinkText("Отложить")).click();
        //driver.findElement(By.id("ui-input-search__icon ui-input-search__icon_search")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.findElement(By.linkText("В корзине")).click();
        //driver.findElement(By.partialLinkText("Отложенные")).click();
        //String result = driver.findElement(By.className("snippet-card__header-link shop-history__link link i-bem link_js_inited")).toString();
        /*if (product.equals(result)){
            System.out.println("Всё норм");
        }
        else {
            System.out.println("Yt yjhv");
        }*/
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
    /*WebDriver webDriver;
    WebDriverWait webDriverWait;
    public YaMarketTest (WebDriver driver){
        webDriver = driver;
        webDriverWait = new WebDriverWait(webDriver, 30);
        driver.get("http://www.guru99.com/live-testing-project.html");
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(css = "a[title = 'Java']")
    private WebElement javaTitle;
    public void clickToJavaTitle(){
        javaTitle.click();
    }
    @Test
    public void titleTest(){
        System.setProperty("webdriwer.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.guru99.com/live-testing-project.html");
        Assert.assertEquals(driver.getTitle(), "Live Manual Testing Project: Online Software Testing Practice");
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30, 500);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("g-grid")));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
    @Test
    public void titleTestNew(){
        System.setProperty("webdriwer.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.guru99.com/live-testing-project.html");
        //driver1.findElement(By.xpath("//*(text() = 'Web')"));
        driver.findElement(By.partialLinkText("Java")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.guru99.com/java-tutorial.html"));
        driver.close();
    }
    @Test
    public void mainPage(){

    }*/
}
