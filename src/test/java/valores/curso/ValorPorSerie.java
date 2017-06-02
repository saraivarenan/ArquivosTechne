package valores.curso;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;
import variaveis.produto.CursoVar;

public class ValorPorSerie extends InicializarFirefox {

	
	@Test
	public void cadastrarServiçoCurso (){
		
		CursoVar varCurso = new CursoVar();
		WebDriverWait wa =  new WebDriverWait(getDriver(), 3);
		
		
		getDriver().get("http://cq-virt:8080/Secretaria/Secretaria/configuracao/TCONF024D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.tempo(4);
		getDriver().findElement(By.id("sboCurso")).sendKeys( "00023"/*varCurso.getCurso()*/, Keys.TAB);
		UtilidadesMetodos.tempo(2);

	boolean existe = UtilidadesMetodos.elementoExiste(By.xpath("//*[contains(@class, 'x-grid3-cell-inner x-grid3-col-fldCurso')]"));
		
		if ( existe == true){
			
			WebElement drpTurno = getDriver().findElement(By.id("ddoTurno"));
			UtilidadesMetodos.buscaDrop(drpTurno, "CQ-2016 - Controle de Qualidade");
			
			WebElement drpCurriculo = getDriver().findElement(By.id("ddoCurriculo"));
			
			UtilidadesMetodos.buscaDrop(drpCurriculo, "TES-Cont");
			UtilidadesMetodos.tempo(2);
			Actions ac = new Actions(getDriver());
			WebElement dropServico = getDriver().findElement(By.xpath("//*[contains(@class, 'x-grid3-cell-inner x-grid3-col-tbfServico')]"));
			
			ac.doubleClick(dropServico).perform();
			UtilidadesMetodos.tempo(3);
			
			WebElement servicoDrop=  getDriver().switchTo().activeElement();
			servicoDrop.clear();
			servicoDrop.sendKeys("EV");
			UtilidadesMetodos.tempo(2);
			servicoDrop.sendKeys(Keys.ENTER);
			UtilidadesMetodos.tempo(2);
			
			getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div//table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td[2]/em/button")).click();
			UtilidadesMetodos.tempo(3);
			//div[2]/div[2]/div/div/div/div/div//table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td[2]/em/button
			//servicoDrop.sendKeys(Keys.ENTER );
			//WebElement servicoDrop = getDriver().findElement(By.id("tbfServico:controle"));
			
			  
		}else{
			
			UtilidadesMetodos.btnNovo();
			
			getDriver().findElement(By.id("srcCurso")).sendKeys(varCurso.getCurso(), Keys.TAB);
			UtilidadesMetodos.tempo(2);
			 WebElement drpTipoCob = getDriver().findElement(By.id("txbValorCredAssocDisc"));
			 UtilidadesMetodos.buscaDrop(drpTipoCob, "Disciplina");
			 
			 UtilidadesMetodos.btnSalvar();
			UtilidadesMetodos.tempo(3);
			
			WebElement drpTurno = getDriver().findElement(By.id("ddoTurno"));
			UtilidadesMetodos.buscaDrop(drpTurno, "CQ-2016 - Controle de Qualidade");
			
			WebElement drpCurriculo = getDriver().findElement(By.id("ddoCurriculo"));
			
			UtilidadesMetodos.buscaDrop(drpCurriculo, "TES-Cont");
			UtilidadesMetodos.tempo(2);
			Actions ac = new Actions(getDriver());
			WebElement dropServico = getDriver().findElement(By.xpath("//*[contains(@class, 'x-grid3-cell-inner x-grid3-col-tbfServico')]"));
			
			ac.doubleClick(dropServico).perform();
			UtilidadesMetodos.tempo(3);
			
			WebElement servicoDrop=  getDriver().switchTo().activeElement();
			servicoDrop.clear();
			servicoDrop.sendKeys("EV");
			UtilidadesMetodos.tempo(2);
			servicoDrop.sendKeys(Keys.ENTER);
			UtilidadesMetodos.tempo(2);
			
			getDriver().findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div//table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td[2]/em/button")).click();
			UtilidadesMetodos.tempo(3);
			
		
		}
		
		
		
		UtilidadesMetodos.tempo(3);
			
		
	}

}
