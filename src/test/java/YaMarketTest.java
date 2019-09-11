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
        String product = "Фитнес-браслет Xiaomi Mi Band 3 Black (XMSH05HM)";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.eldorado.ru");
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@placeholder = 'Поиск среди миллионов товаров']")).sendKeys(product);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Найти']")));
        driver.findElement(By.xpath("//*[text()='Найти']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Добавить в корзину")));
        driver.findElement(By.linkText("Добавить в корзину")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("В корзине")));
        driver.findElement(By.linkText("В корзине")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text = driver.findElement(By.xpath("//a[@href = '/cat/detail/71381975/']")).getText();
        //System.out.println(text);
        if (product.equals(text)){
            System.out.println("Товар добавлен в корзину");
        }
        else {
            System.out.println("Товар не добавлен в корзину");
        }
        driver.findElement(By.xpath("//span[text() = 'Удалить']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}