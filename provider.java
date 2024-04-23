package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class provider {

	@org.testng.annotations.DataProvider(name = "login")
	public String[][] DataProvider() {
		String[][] data = new String[2][2];
		data[0][0] = "gowthamkannan1919@gmail.com"; // ----row 1
		data[0][1] = "passsss2344";

		data[1][0] = "gowthamkannan@gmail.com";
		data[1][1] = "pa12638";

		return data;
	}

	@Test(dataProvider = "login")
	public void Login(String user, String pass) {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement user1 = driver
				.findElement(By.Name("email");
		user1.sendKeys(user);
		WebElement pass2 = driver.findElement(By.Name("password");
		pass2.sendKeys(pass);
		WebElement log = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
		log.click();
	}

}
