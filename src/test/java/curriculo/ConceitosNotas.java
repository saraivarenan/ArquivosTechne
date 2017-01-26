package curriculo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitários.Produto.InicializarFirefox;
import utilitários.Produto.UtilidadesMetodos;

public class ConceitosNotas extends InicializarFirefox {
	
	
	public static String getGrupoConceito() {
	String GrupoConceito = "GRUPO-CQ";
		return GrupoConceito;
	}
	public static String getdescConceito() {
		String descConceito = "Feito pelo script de automatizado";
			return descConceito;
		}
		
	@Test
	public void cadastrarConceito (){
		
		getDriver().get(getUrl() +"/Secretaria/Secretaria/configuracao/TCONF006D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.implicitWait(60);
		UtilidadesMetodos.btnNovo();
		
		
		WebElement txtGrpConceito = getDriver().findElement(By.id("txtGrupo02"));
		txtGrpConceito.sendKeys(ConceitosNotas.getGrupoConceito());
		
		WebElement txtDescrConceito = getDriver().findElement(By.id("txtDescricao02"));
		txtDescrConceito.sendKeys(ConceitosNotas.getdescConceito());
		
		UtilidadesMetodos.tempo(3);
		
		UtilidadesMetodos.btnSalvar();
		
		UtilidadesMetodos.tempo(3);
		WebElement btnConceito = getDriver().findElement(By.xpath("//div[5]/div/div/div[2]/div/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr/td[1]/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button"));
		btnConceito.click();
		
		getDriver().findElement(By.id("txtConceito02")).sendKeys("A");
		getDriver().findElement(By.id("txtNota02")).sendKeys("10");
		getDriver().findElement(By.id("txtValorMinimo02")).sendKeys("9");
		getDriver().findElement(By.id("txtValorMaximo02")).sendKeys("10");
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.xpath("//div[5]/div/div/div[2]/div/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button")).click();
		
		UtilidadesMetodos.tempo(2);
		
	
		btnConceito.click();
		
		getDriver().findElement(By.id("txtConceito02")).sendKeys("B");
		getDriver().findElement(By.id("txtNota02")).sendKeys("8");
		getDriver().findElement(By.id("txtValorMinimo02")).sendKeys("7");
		getDriver().findElement(By.id("txtValorMaximo02")).sendKeys("890");
		UtilidadesMetodos.tempo(3);
		getDriver().findElement(By.xpath("//div[5]/div/div/div[2]/div/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button")).click();
		UtilidadesMetodos.tempo(3);				
		
	btnConceito.click();
		
		getDriver().findElement(By.id("txtConceito02")).sendKeys("C");
		getDriver().findElement(By.id("txtNota02")).sendKeys("7");
		getDriver().findElement(By.id("txtValorMinimo02")).sendKeys("6");
		getDriver().findElement(By.id("txtValorMaximo02")).sendKeys("690");
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.xpath("//div[5]/div/div/div[2]/div/div/div/div/div/div[6]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button")).click();
		
		UtilidadesMetodos.tempo(2);
	} 
	
}
	/*public void deletarConceito (){
		
		getDriver().get(getUrl() +"/Secretaria/Secretaria/configuracao/TCONF006D.tp");
		UtilidadesMetodos.users();
		UtilidadesMetodos.implicitWait(60);
		
		
		String compara = "GRUPO-CQ";
		
		WebElement srcConceitoCriado = null;
		
		//String decr = "script de automatizado";
		
		for (int i =1; i< compara.length(); i++){		
			
			srcConceitoCriado = getDriver().findElement(By.xpath("//div[5]/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div["+i+"]/table/tbody/tr/td[1]/div"));
		System.out.println(srcConceitoCriado.getText());	               
		System.out.println(i);
		 if(srcConceitoCriado.getText().equals("GRUPO-CQ"))
		 {
			 srcConceitoCriado.click();
			break;
		 }
			 
			
			
		
		//WebElement srcConceitoCriado = getDriver().findElement(By.xpath("//div[contains(text(),'"+srcConceitoCriado.getText()+"')]"));
		
		}
		
		WebElement btnApagar = getDriver().findElement(By.xpath("//button[@class=' x-btn-text t-button minus']"));
		btnApagar.click();
		UtilidadesMetodos.implicitWait(60);
		
		WebElement confirmarExclusão = getDriver().findElement(By.xpath("//button[contains(text(), 'Sim')]"));
		confirmarExclusão.click();
		
	//	srcConceitoCriado.click();
			
	//	div[5]/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div[1]
		
	//	/html/body/div[5]/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div[2]
	
	}

*/

