package project_5_com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Edge";

    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }

        //Open Url
        driver.get(baseUrl);

        //Print the title of the Page
       String title = driver.getTitle();
        System.out.println("Title of the Page"+ title);

        //Print the current url
         String currentUrl= driver.getCurrentUrl();
        System.out.println("Get Current URL" + currentUrl);

        //Print the page source
         String pageSource = driver.getPageSource();
        System.out.println("Print the page source"+pageSource);

        //Enter the email to email field
       WebElement emai  =driver.findElement(By.id("user[email]"));
       emai.sendKeys("Amazingaarti1234@gmail.com");

       //Enter the Password to password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("Helloworld");

        //Close the browser
        driver.close();
    }
}
