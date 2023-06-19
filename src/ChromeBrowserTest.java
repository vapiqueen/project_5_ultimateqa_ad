import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ChromeBrowserTest {
    public static void main(String[] args) {

        //Setup Chrome Browser

        WebDriver driver = new ChromeDriver();

        //Open URL
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        driver.get(baseurl);

        //Maximise the browser window
        driver.manage().window().maximize();

        //Implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Print the tite of page"+title);

        //Print the Current Url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Print the current Url"+ currentUrl);

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("Print the page source"+pageSource);

        //Print the email to email field
        WebElement email =driver.findElement(By.id("user[email]"));
        email.sendKeys("Amazingaarti1234@gmail.com");

        //Print the password in password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("Helloworld");

        //Close the browser
        driver.close();
        }
    }
