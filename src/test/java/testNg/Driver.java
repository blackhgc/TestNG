package testNg;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Driver {

    @Test
    public void OpenChrome(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.baidu.com");
        driver.close();

    }

    @Test
    public void OpenE() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void OpenI(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.baidu.com");
        /*
        * 获取url
        * */
        String Url = driver.getCurrentUrl();
        driver.navigate().back();
        driver.navigate().to("https://www.bilibili.com");
        driver.quit();
    }

    @Test
    public void Open() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        Dimension dimension = new Dimension(300,300);
        driver.manage().window().setSize(dimension);
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }


}
