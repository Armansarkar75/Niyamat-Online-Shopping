import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellerRge {

	public static void main(String[] args) {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.niyamatonline.com/");
		//Seller signup
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.id("name")).sendKeys("Arman");
		driver.findElement(By.id("photo")).sendKeys("eeeeee");
		driver.findElement(By.name("number")).sendKeys("01311848915");
		driver.findElement(By.id("email")).sendKeys("armansarkar715@gmail.com");
		driver.findElement(By.id("address")).sendKeys("mirpur 10");
		driver.findElement(By.name("account")).sendKeys("1234567890");
		driver.findElement(By.name("nid")).sendKeys("1234567890");
		driver.findElement(By.id("password")).sendKeys("mirpur 10");
		driver.findElement(By.id("confirmPassword")).sendKeys("mirpur 10");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/form/div[10]/button/div")).click();
		
		
		
		
		
	}

}
