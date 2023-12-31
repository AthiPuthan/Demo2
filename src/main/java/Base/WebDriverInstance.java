package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverInstance {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		if (driver.get() == null) {
			try {
				driver.set(createDriver());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return driver.get();
	}

	public static WebDriver createDriver() throws IOException {

		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Config.properties");
		prop.load(fi);

		if (prop.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (prop.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;

	}

	public static void cleanUpDriver() {
		driver.get().quit();
		driver.remove();
	}

}
