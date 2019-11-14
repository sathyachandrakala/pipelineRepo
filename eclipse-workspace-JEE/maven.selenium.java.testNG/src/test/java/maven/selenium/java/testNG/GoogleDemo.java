package maven.selenium.java.testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://Google.com";
        driver.get(url);
        driver.manage().window().maximize();
        
	}

}
