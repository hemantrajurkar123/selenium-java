package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.className("gLFyf")).sendKeys("Hello World");
		Thread.sleep(3000);

		driver.findElement(By.className("gNO89b")).click();
		driver.quit();
	}

}
