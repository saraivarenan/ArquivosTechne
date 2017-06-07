package utilitarios.Produto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class UtilidadesMetodos extends InicializarFirefox {

	
	public static void users (){
		
		WebElement user = getDriver().findElement(By.id("j_user"));
		user.sendKeys("techne");
		
		WebElement pass = getDriver().findElement(By.id("j_password"));
		pass.sendKeys("123456789");
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
	 
	 public static boolean elementoExiste(By by){
		    try {
		        getDriver().findElement(by);
		        return true;
		    }
		    catch (org.openqa.selenium.NoSuchElementException e){
		        return false;
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
		 UtilidadesMetodos.tempo(2);
		 
		 getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button plus']")).click();
	 }
	public static void btnSalvar(){
		getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button save']")).click();
		
	}
	public static void btnEditar(){
		getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button restore']")).click();
		
	}
	
	public String geraCPF() {
	     int digito1 = 0, digito2 = 0, resto = 0;
	     String  nDigResult;
	     String numerosContatenados;
	     String numeroGerado;
	     Random numeroAleatorio = new Random();
	      //numeros gerados
	     int n1 = numeroAleatorio.nextInt(10);
	     int n2 = numeroAleatorio.nextInt(10);
	     int n3 = numeroAleatorio.nextInt(10);
	     int n4 = numeroAleatorio.nextInt(10);
	     int n5 = numeroAleatorio.nextInt(10);
	     int n6 = numeroAleatorio.nextInt(10);
	     int n7 = numeroAleatorio.nextInt(10);
	     int n8 = numeroAleatorio.nextInt(10);
	     int n9 = numeroAleatorio.nextInt(10);
	     int soma = n9*2 + n8*3 + n7*4 + n6*5 + n5*6 + n4*7 + n3*8 + n2*9 + n1*10;
	     int valor = (soma / 11)*11;
	     digito1 = soma-valor;
	      //Primeiro resto da divisão por 11.
	     resto = (digito1 % 11);
	     if(digito1 < 2){
	      digito1 = 0;
	     }
	     else {
	       digito1 = 11-resto;
	     }
	    int soma2 = digito1 * 2 + n9*3 + n8*4 + n7*5 + n6*6 + n5*7 + n4*8 + n3*9 + n2*10 + n1*11;
	    int valor2 = (soma2 / 11)*11;
	     digito2 = soma2-valor2;
	      //Primeiro resto da divisão por 11.
	     resto = (digito2 % 11);
	     if(digito2 < 2){
	      digito2 = 0;
	     }
	     else {
	       digito2 = 11-resto;
	     }
	     //Conctenando os numeros
	     numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) +"." + String.valueOf(n4) +
	                           String.valueOf(n5) + String.valueOf(n6) +"."+ String.valueOf(n7) +String.valueOf(n8)  +
	                           String.valueOf(n9)+"-";
	     //Concatenando o primeiro resto com o segundo.
	      nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
	      numeroGerado = numerosContatenados+nDigResult;
	      System.out.println("CPF Gerado " + numeroGerado);
	      return numeroGerado;
	    }//fim do metodo geraCPF
	    public  String mostraResultado() {
	     String resultadoCPF = geraCPF();
	     return resultadoCPF;
	    }
	
public static String compEmail(){
	
	int valorUnic = (int) (Math.random()* 10001);
	String email = String.valueOf(valorUnic);

	return email;
		
	}
	 
	
	
	
}
