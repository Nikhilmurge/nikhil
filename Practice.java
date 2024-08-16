package new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
		String path ="C:\\java_prog\\browser\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", path);
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://mvnrepository.com");
       
	}

}
