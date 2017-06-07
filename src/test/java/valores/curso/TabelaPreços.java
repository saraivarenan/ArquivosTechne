package valores.curso;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;
import variaveis.produto.ServicoValorVar;

public class TabelaPreços extends InicializarFirefox {
	ServicoValorVar serVar = new ServicoValorVar();
	
	@Test	
	public void cadastrarPreço (){
		
		getDriver().get("http://lyc-desenv:8080/Secretaria/Secretaria/financeiro/TFIN073D.tp");
		UtilidadesMetodos.users();
		UtilidadesMetodos.tempo(3);
		
	
		UtilidadesMetodos.implicitWait(30);
		UtilidadesMetodos.btnNovo();
		
		
		getDriver().findElement(By.id("txtServico")).sendKeys(serVar.getCodServico());
		getDriver().findElement(By.id("txtDescricao")).sendKeys(serVar.getDescServico());
		getDriver().findElement(By.id("srcCodLanc")).sendKeys(serVar.getCodLanc(), Keys.TAB);
		WebElement drpTipoServ = getDriver().findElement(By.id("drpTipo"));
		
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.buscaDrop(drpTipoServ, serVar.getTipoServico());
		
		UtilidadesMetodos.tempo(2);
		
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(3);
		
	//	UtilidadesMetodos.implicitWait(30);
		
		
		getDriver().findElement(By.id("srcServicos")).sendKeys(serVar.getCodServico(), Keys.TAB);
		UtilidadesMetodos.tempo(3);
		String servCadastrado = getDriver().findElement(By.xpath("//*[contains(@class, 'x-grid3-cell-inner x-grid3-col-gpfServico')]")).getText();
				
		assertTrue("Serviço cadastrado", serVar.getCodServico().equals(servCadastrado));
		
		
		
	
		
	}
	
	

}
