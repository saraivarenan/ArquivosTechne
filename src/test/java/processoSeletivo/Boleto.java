package processoSeletivo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class Boleto extends InicializarFirefox{
	
	@Test
	public void cadastrarBoleto(){
		getDriver().get(getUrl()+"/Secretaria/Secretaria/processoseletivo/TVEST017D.tp");
		UtilidadesMetodos.users();
		
		getDriver().findElement(By.id("blkConcurso.sboConcurso")).sendKeys(Concurso.txtConcurso);
		getDriver().findElement(By.id("blkConcurso.sboConcurso")).sendKeys(Keys.TAB);
		
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.btnEditar();
		UtilidadesMetodos.tempo(2);
		
		getDriver().findElement(By.id("ckbTemBoleto")).click();
		
		getDriver().findElement(By.id("srcBanco")).sendKeys("1");
		getDriver().findElement(By.id("srcBanco")).sendKeys(Keys.TAB);
		
		getDriver().findElement(By.id("srcAgencia")).sendKeys("0191");
		getDriver().findElement(By.id("srcAgencia")).sendKeys(Keys.TAB);
		
		getDriver().findElement(By.id("srcConta")).sendKeys("19789");
		getDriver().findElement(By.id("srcConta")).sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(2);
		
		WebElement drpconvenio = getDriver().findElement(By.id("ddConvenio"));
		
		UtilidadesMetodos.buscaDrop(drpconvenio, "1090801");
		
		getDriver().findElement(By.id("txbValorInscr")).sendKeys("10000");
		
		getDriver().findElement(By.id("txbNumDiasVencBoleto")).sendKeys("15");
		
		WebElement drpmodelo = getDriver().findElement(By.id("ddModelosImpressao"));
		UtilidadesMetodos.buscaDrop(drpmodelo, "Modelo 1");
				
		UtilidadesMetodos.tempo(3);
		
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(2);
			
		
		
		
		
	}

}
