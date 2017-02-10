package utilitários.Produto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class UtilidadesMetodos extends InicializarFirefox {

	
	public static void users (){
		
		WebElement user = getDriver().findElement(By.id("j_user"));
		user.sendKeys("techne");
		
		WebElement pass = getDriver().findElement(By.id("j_password"));
		pass.sendKeys("12345678");
		pass.submit();
	}
	 public static void tempo(int tempoSegundos) {

		  tempoSegundos = tempoSegundos * 1000;
		  try {
		   Thread.sleep(tempoSegundos);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }

		 }
 
	 public static void buscaDropReverso(WebElement ElementoDrp, String ValorComparado) {

			int cont = 0;
			String nomeFunc = ElementoDrp.getAttribute("value");
			while (!nomeFunc.equals("@@@")) {
				ElementoDrp.sendKeys(Keys.DOWN);
				ElementoDrp.sendKeys(Keys.ARROW_UP);
				ElementoDrp.sendKeys(Keys.ENTER);
				nomeFunc = ElementoDrp.getAttribute("value");
				cont++;

				System.out.println(nomeFunc);

				if (nomeFunc.equals(ValorComparado)) {
					ElementoDrp.sendKeys(Keys.TAB);
					break;

				} else if (cont > 30) {
					System.out.println("Valor n�o encontrado");
					break;

				}
			}
	}
	 
	 public static void buscaDrop(WebElement drpNome, String ValorComparado) {

			int cont = 0;
			String nomeFunc = drpNome.getAttribute("value");
			while (!nomeFunc.equals("@@@")) {
				drpNome.sendKeys(Keys.ARROW_DOWN);
				drpNome.sendKeys(Keys.ARROW_DOWN);
				drpNome.sendKeys(Keys.ENTER);
				nomeFunc = drpNome.getAttribute("value");
				cont++;

				System.out.println(nomeFunc);

				if (nomeFunc.equals(ValorComparado)) {
					drpNome.sendKeys(Keys.ENTER);
					break;

				} else if (cont > 10) {
					buscaDropReverso(drpNome, ValorComparado);
					break;

				}

			}
	}
	 
	 public static void fileUpload(String caminho){
		 StringSelection ss = new StringSelection(caminho);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 UtilidadesMetodos.tempo(3);
		 try {
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 UtilidadesMetodos.tempo(2);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 } catch (AWTException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		 }
	 
	 public static boolean implicitWait(long time) {
		   try {
		    getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		    System.out.println("Waited for " + time + " sec implicitly");

		   } catch (Exception e) {
		    return false;
		   }
		   return true;
		  }
	 
	 public static void btnNovo(){
		 
		 getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button plus']")).click();
	 }
	public static void btnSalvar(){
		getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button save']")).click();
		
	}
	public static void btnEditar(){
		getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button restore']")).click();
		
	}
	 
	}
