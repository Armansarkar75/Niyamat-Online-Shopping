import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	public static void main(String[] args) {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.niyamatonline.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[2]/div/a/button")).click();
		driver.findElement(By.id("email")).sendKeys("armansarkar715@gmail.com");
		driver.findElement(By.name("password")).sendKeys("112233abc");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div[2]/form/div[4]/button")).click();

	}

}
