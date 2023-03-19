package tuhoc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testcaseGG {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String osName = System.getProperty("os.name");

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	}

	@Test
	public void TC_Search_by_Enter() {
		// Tìm đối tượng input và gửi dữ liệu
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Automation Test");

		// Nhấn phím Enter
		searchBox.sendKeys(Keys.RETURN);

		// Kiểm tra xem kết quả tìm kiếm có chứa từ khóa "Automation Test" hay không
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Automation Test"), "Search results page not displayed for 'Automation Test'");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

//	public void sleepInSecond(long timeInSecond) {
//		try {
//			Thread.sleep(timeInSecond * 1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
}