package disciplina;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilitários.Produto.InicializarFirefox;
import utilitários.Produto.UtilidadesMetodos;

public class PlanoDidatico extends InicializarFirefox {
	
	@Test
	public void cadatrPlanoDida (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR047D.tp");
		UtilidadesMetodos.users();
		
		getDriver().findElement(By.id("blkDisciplina.sboDisciplina")).sendKeys("A016-CQ0");
		getDriver().findElement(By.id("blkDisciplina.sboDisciplina")).sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(3);
		UtilidadesMetodos.btnEditar();
		UtilidadesMetodos.tempo(2);
	
		getDriver().findElement(By.id("ckbPodeAlterarTurma")).click();
		getDriver().findElement(By.id("txbEmentaResumo")).sendKeys("Teste Controle de Qualidade, ementa para disciplina teste");
		getDriver().findElement(By.id("txbObjetivo")).sendKeys("Fluxo Funcionais Controle de Qualidade");
		getDriver().findElement(By.id("txbMetodologia")).sendKeys("Script selenium");
		getDriver().findElement(By.id("txbCriterioAval")).sendKeys("Provas, teste CQ");
		getDriver().findElement(By.id("txbAtivAcadSuperv")).sendKeys("Teste");
		 
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.xpath("//span[contains(text(),'Programa do Plano')]")).click();
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txbAula")).sendKeys("CQ1");
		getDriver().findElement(By.id("txbAssuntoAtividades")).sendKeys("Controle de Qualidade Script Teste");
		getDriver().findElement(By.id("txbBibliografia")).sendKeys("CQ, Teste-Controle");
		getDriver().findElement(By.id("txbObservacoes")).sendKeys("Teste Script");
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.xpath("//div[3]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button")).click();
		UtilidadesMetodos.tempo(3);
	}

}
