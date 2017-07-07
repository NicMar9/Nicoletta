package esercitazionewebdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Esercizioparentchild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmartone\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("http://www.trenitalia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[src=\"/cms-file/immagini/trenitalia2014/Homepage/pulsante_menu_FC.jpg\"]"))
				.click();

		Set<String> idS = driver.getWindowHandles();
		Iterator<String> itS = idS.iterator();
		String firstPage = itS.next();
		String secondPage = itS.next();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[src=\"/cms-file/immagini/trenitalia2014/Homepage/pulsante_menu_FC.jpg\"]"))
				.click();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[src=\"/cms-file/immagini/trenitalia2014/Homepage/pulsante_menu_FC.jpg\"]"))
				.click();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		idS = driver.getWindowHandles();
		itS = idS.iterator();
		firstPage = itS.next();
		secondPage = itS.next();
		String thirdPage = itS.next();
		String fourthPage = itS.next();

		Thread.sleep(2000);
		driver.switchTo().window(secondPage);

		Thread.sleep(2000);
		driver.findElements(By.cssSelector("[name=\"textfield\"]")).get(1).sendKeys("nicoletta");

		Thread.sleep(2000);
		driver.switchTo().window(thirdPage);

		Thread.sleep(2000);
		driver.findElements(By.cssSelector("[name=\"textfield\"]")).get(1).sendKeys("scioperi");

		Thread.sleep(2000);
		driver.switchTo().window(firstPage);

		Thread.sleep(2000);
		driver.findElements(By.cssSelector("[name=\"textfield\"]")).get(1).sendKeys("cartafreccia");
		
		
		

	}

}
