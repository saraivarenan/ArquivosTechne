package valores.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;
import variaveis.produto.ValorServicoAnoPeriodoVar;

public class ValorServicoAnoPeriodo extends InicializarFirefox{
ValorServicoAnoPeriodoVar valorservVar = new ValorServicoAnoPeriodoVar();
	
	@Test
	public void cadastrarValorServ (){
		
		getDriver().get("http://lyc-desenv:8080/Secretaria/Secretaria/configuracao/TCONF061D.tp");
		UtilidadesMetodos.users();
		UtilidadesMetodos.tempo(2);
		
		getDriver().findElement(By.id("sboServico")).sendKeys(valorservVar.getCodServico(), Keys.TAB);
		
		WebElement drpAno = getDriver().findElement(By.id("ddoAno"));		
		UtilidadesMetodos.buscaDrop(drpAno, valorservVar.getAno());
		UtilidadesMetodos.tempo(1);
		
		WebElement drpPeriodo = getDriver().findElement(By.id("ddoPeriodo"));
		UtilidadesMetodos.buscaDrop(drpPeriodo, valorservVar.getPeriodo());
		UtilidadesMetodos.tempo(2);
		
		boolean existeGrid = UtilidadesMetodos.elementoExiste(By.xpath("//*[contains(@class, 'x-grid3-cell-inner x-grid3-col-fldServico')]"));
		
		if ( existeGrid == true){
			getDriver().quit();
			
		} else {
			
			UtilidadesMetodos.btnNovo();
			UtilidadesMetodos.tempo(3);
			getDriver().findElement(By.id("txtCustoUnitario02")).sendKeys(valorservVar.getCusto());
			
			WebElement drpPeriodoRecord = getDriver().findElement(By.id("ddPeriodo"));
			UtilidadesMetodos.buscaDrop(drpPeriodoRecord, "1");
			UtilidadesMetodos.tempo(2);
			
			UtilidadesMetodos.tempo(2);
			UtilidadesMetodos.btnSalvar();			
			UtilidadesMetodos.tempo(2);
		}
		
		String servCadastrado = getDriver().findElement(By.xpath("//*[contains(@class, 'x-grid3-cell-inner x-grid3-col-fldServico')]")).getText();
		
		assertTrue("Serviço cadastrado", valorservVar.getCodServico().equals(servCadastrado));
		
		
		
	}

}
