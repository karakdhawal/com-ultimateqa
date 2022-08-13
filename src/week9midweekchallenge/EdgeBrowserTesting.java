package week9midweekchallenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {

    public void edgetest () {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();

    }

    public static void main(String[] args) {
        EdgeBrowserTesting obj = new EdgeBrowserTesting();
        obj.edgetest();
    }

}
