package week9midweekchallenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTesting {

    public void firefoxtest () {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }

    public static void main(String[] args) {
        FireFoxTesting obj = new FireFoxTesting();
        obj.firefoxtest();
    }


}
