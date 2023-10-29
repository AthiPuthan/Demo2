package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    private String url;
	private Properties prop;

	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Config.properties");
		prop.load(data);
	}

	public static WebDriver getdriver() throws InterruptedException, IOException {
		return WebDriverInstance.getDriver();
	}

	public String getUrl() throws IOException {
		url = prop.getProperty("url");
		return url;
	}

	public void takeSnapShot(String result) throws IOException, WebDriverException, InterruptedException {
		File srcFile = ((TakesScreenshot) getdriver()).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+"\\target\\Screenshots" + timeStamp() + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}

	public String timeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	/*public static void waitForInvisibleElement(WebElement ele,int i) throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(getdriver(), i);
		wait.until(ExpectedConditions.invisibilityOf(ele));
		
	}*/
}
