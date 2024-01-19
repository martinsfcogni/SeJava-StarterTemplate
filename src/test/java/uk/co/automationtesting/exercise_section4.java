package uk.co.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class exercise_section4 {

    /*
    @Test
    public  void helloWorld() {
        System.out.println("Hello World!");
    }

    @Test
    public  void helloWorld2() {
        System.out.println("Hello World!2");

        System.setProperty("webdriver.chrome.driver", "C:\\Resources\\chromedriver\\118\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");


        //driver.quit();
    }
    */

    @Test
    public  void helloWorld3() throws InterruptedException {
        System.out.println("Hello World!3");

        System.setProperty("webdriver.chrome.driver", "C:\\Resources\\chromedriver\\118\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/");

        sleep(2000);

        //driver.findElement(By.linkText("LOADER")).click();    //
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[13]/a")).click();


    }

}
