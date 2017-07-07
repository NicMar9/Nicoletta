package esercitazionewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Searchassioma {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmartone\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://analisi.assioma.info:8090/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("[href=\"/owners/find\"]")).click();
		
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("[href=\"/owners/new\"]")).click();
		
        //REGISTRAZIONE DATI E LOGIN
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id=\"firstName\"]")).sendKeys("Nic");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id=\"lastName\"]")).sendKeys("Mar");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id=\"address\"]")).sendKeys("Via abcde"); 
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id=\"city\"]")).sendKeys("Milano");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id=\"telephone\"]")).sendKeys("123456789");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		Thread.sleep(1000);
		driver.findElements(By.cssSelector("[class=\"btn btn-default\"]")).get(1).click();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id=\"name\"]")).sendKeys("Dog");
		
		Thread.sleep(1000);		
		driver.findElement(By.cssSelector("[id=\"birthDate\"]")).sendKeys("2017/01/20");
		
		Thread.sleep(1000);		
		Select s= new Select(driver.findElement(By.id("type")));
		s.selectByValue("dog");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Add Visit")).click();
		
		Thread.sleep(1000);
		driver.findElements(By.cssSelector("[type=\"text\"]")).clear();
		
		Thread.sleep(1000);
		driver.findElements(By.cssSelector("[type=\"text\"]")).get(1).sendKeys("Vaccinazione");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	
		
		
		
		
		//driver.findElement(By.cssSelector("[href=\"/vets.html\"]")).click();
	
		
		
		//Thread.sleep(1000);
		//driver.findElement(By.cssSelector("[[href=\"/owners/find\"]")).click();
		
		//driver.findElement(By.linkText("Add New Pet")).click();
		//WebElement target = driver.findElement(By.id("type"));
		
		//Select s= new Select(driver.findElement(By.id("type")));
		//s.selectByValue("dog");
		
		
	
	}

}
