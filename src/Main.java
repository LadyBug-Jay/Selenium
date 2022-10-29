import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        String path="https://www.google.com/";
        driver.get(path);
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();

        if (path.equalsIgnoreCase(url)){
            System.out.println("Match");
        }else{
            System.out.println("No Match");
        }

        if (title.equalsIgnoreCase("google")){
            System.out.println("Match");
        }else{
            System.out.println("No Match");
        }
driver.quit();



    }
}