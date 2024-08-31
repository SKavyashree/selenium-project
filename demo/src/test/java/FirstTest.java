import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

class FirstTest{

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //  WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com");
        String page_title = driver.getTitle();
        System.out.println(page_title);
        System.out.println(driver.getCurrentUrl());
        driver.close();
        
    }

// @Test
//     void sampleRun() {
//         WebDriverManager.chromedriver().setup();
//         WebDriver driver = new ChromeDriver();
//       //  WebDriver driver = new FirefoxDriver();
//         driver.get("https://rahulshettyacademy.com");
//         String page_title = driver.getTitle();
//         System.out.println(page_title);
//         System.out.println(driver.getCurrentUrl());
//         driver.close();
        
//     }
// }