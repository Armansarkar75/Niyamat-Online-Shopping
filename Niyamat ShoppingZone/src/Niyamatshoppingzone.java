import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Niyamatshoppingzone {

	public static void main(String[] args) {
		//signup form test
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.niyamatonline.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div[2]/div/a/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div[2]/form/label/a/a")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/button")).click();
		driver.findElement(By.id("name")).sendKeys("Arman");
		driver.findElement(By.id("photo")).sendKeys("sc_compressed_gm_40_qyb5lOTk2ODM2MjQ2NQ  ");
		driver.findElement(By.id("email")).sendKeys("armansarkar715@gmail.com");
		driver.findElement(By.id("password")).sendKeys("armansarkar");
		driver.findElement(By.id("confirmPassword")).sendKeys("armansarkar");
		driver.findElement(By.cssSelector("#root > div > div > div > div > div.card > div > div > "
				+ "form > div:nth-child(7) > button > div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/form/div[6]/button/div")).click();
		

	}

}