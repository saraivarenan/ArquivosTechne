package utilitários.Produto;

	

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InicializarFirefox {
	
	
	static WebDriver driver;
	static String url;
	
		
	@Before
	public void abrirNavegador ( ){
		
		
		//seta o plugin para emular o chrome			  
		     System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		// abre no chrome
	  driver = new ChromeDriver();
		
		
	/*	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get(""); */
		driver.manage().window().maximize();
	
	} 
	
	@AfterClass
	public static void fecharNavegador(){
	    if(driver != null){
	        driver.close();}
	   
	
	        

	}
	
	
	public static WebDriver  getDriver() {
		return driver;
	}

	public static String getUrl() {
		url = "http://lyc-desenv:8080";
		return url;
	}
	
	

}
