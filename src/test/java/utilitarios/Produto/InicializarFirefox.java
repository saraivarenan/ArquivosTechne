package utilitarios.Produto;

	

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InicializarFirefox {
	
	
	static WebDriver driver;
	static String url;
	
		
	@Before
	public void abrirNavegador ( ){
		
		
		//seta o plugin para emular o chrome			  
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\renan.moura\\git\\cq-lyceum-produto-autoteste\\DriversInicializacao\\chromedriver.exe");
		    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		// abre no chrome
		    driver = new ChromeDriver();
		
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\renan.moura\\git\\cq-lyceum-produto-autoteste\\DriversInicializacao\\geckodriver.exe");
	//	driver = new FirefoxDriver();
		
		//driver.get("");
		driver.manage().window().maximize();
	
	} 
	
	@After
	public void fecharNavegador(){
        driver.quit();
	     

	}
	
	
	public static WebDriver  getDriver() {
		return driver;
	}

	public static String getUrl() {
		url = "http://lyc-desenv:8080";
		return url;
	}
	public static String getPSPortal (){
		url = "http://lyc-desenv:7030/processoseletivo";
		return url;
	}
	
	

}
