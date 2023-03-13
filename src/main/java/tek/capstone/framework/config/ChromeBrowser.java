package tek.capstone.framework.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser implements Browser {
    public WebDriver openBrowser(String url) {
        
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
        
    }

}