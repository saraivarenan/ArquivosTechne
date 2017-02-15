package processoSeletivo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class OfertasDeCurso extends InicializarFirefox {
	
	@Test	
	public void cadastrarOfertas (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/processoseletivo/TVEST015D.tp");
		UtilidadesMetodos.users();
		
		getDriver().findElement(By.id("blkConcurso.sboConcurso")).sendKeys(Concurso.txtConcurso);
		getDriver().findElement(By.id("blkConcurso.sboConcurso")).sendKeys(Keys.TAB);
		
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txtDescricaoAbrev02")).sendKeys("OfertaCQ-01");
		getDriver().findElement(By.id("txtDescricaoCompl02")).sendKeys("Descricao Oferta CQ");
		getDriver().findElement(By.id("srcIdSubGrupoOferta")).sendKeys("20220");
		getDriver().findElement(By.id("srcIdSubGrupoOferta")).sendKeys(Keys.TAB);
		getDriver().findElement(By.id("txtValorInscricao02")).sendKeys("5000");
		getDriver().findElement(By.id("txtDtini02")).sendKeys("01012017");
		getDriver().findElement(By.id("txtDtfim02")).sendKeys("31122017");
		WebElement drpAno =getDriver().findElement(By.id("ddAnoIngresso"));
		drpAno.clear();
		drpAno.sendKeys("2017");
		drpAno.sendKeys(Keys.ENTER);
		
		WebElement drpPeriodo = getDriver().findElement(By.id("ddPeriodoIngresso"));
		UtilidadesMetodos.buscaDrop(drpPeriodo, "1 - 1ºSem");
		
		WebElement cursoPS = getDriver().findElement(By.id("srcCurso"));
		cursoPS.sendKeys("201");		
		cursoPS.sendKeys(Keys.TAB);
		WebElement drpTurno = getDriver().findElement(By.id("ddTurno"));
		
		UtilidadesMetodos.buscaDrop(drpTurno, "NOTURNO");
		WebElement ddCurriculo = getDriver().findElement(By.id("ddCurriculo"));
		ddCurriculo.clear();
		ddCurriculo.sendKeys("001");
		ddCurriculo.sendKeys(Keys.ENTER);
		getDriver().findElement(By.id("txtVagas02")).sendKeys("10");
		
		UtilidadesMetodos.tempo(3);
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(2);
	}

}
