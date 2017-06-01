package turmas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class AssistCriarDiscAvulsa extends InicializarFirefox{

	@Test
	public void criarTurmaAvulsa () {
	
		getDriver().get(getUrl()+"/Secretaria/Secretaria/turmas/TACDT002D.tp");
		UtilidadesMetodos.users();
		
		WebElement anoTodos = getDriver().findElement(By.id("drpAno"));
		UtilidadesMetodos.buscaDrop(anoTodos, "(Todos)");

		WebElement cursoCod = getDriver().findElement(By.id("srcCurso"));
		cursoCod.sendKeys("201");
		cursoCod.sendKeys(Keys.TAB);

		WebElement turnoCod = getDriver().findElement(By.id("drpTurno"));
		UtilidadesMetodos.buscaDrop(turnoCod, "Controle de Qualidade");
		UtilidadesMetodos.tempo(1);

		WebElement curriculoCod = getDriver().findElement(By.id("drpCurriculo"));
		UtilidadesMetodos.buscaDrop(curriculoCod, "999");
		UtilidadesMetodos.tempo(2);
		WebElement drpDisciplina = getDriver().findElement(By.id("srcDisciplina"));
		drpDisciplina.sendKeys("00001");
		drpDisciplina.sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(3);
		getDriver().findElement(By.id("metSelecionarDisciplinasAvulsas:text")).click();
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.xpath("//td/div/div/input")).click();
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.xpath("//div/table/tbody/tr/td[8]/div")).click();
		
		UtilidadesMetodos.tempo(3);
		
		WebElement quantiTurm = getDriver().switchTo().activeElement();
		quantiTurm.sendKeys("1");
		quantiTurm.sendKeys(Keys.ENTER);
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.id("metAvancarDisciplinasAvulsas:text")).click();
		 UtilidadesMetodos.tempo(2);
		 
		 
		 
		 
		 
		
		
		UtilidadesMetodos.implicitWait(30);
		WebElement drpActive = getDriver().switchTo().activeElement();
		assertTrue( drpActive.getAttribute("value").equals("(Não Informado)"));
		UtilidadesMetodos.buscaDrop(drpActive, "2017");
		
		WebElement drpPer = getDriver().findElement(By.id("drpPeriodoDestino"));
		UtilidadesMetodos.buscaDrop(drpPer, "1 - 1ºSem");
		UtilidadesMetodos.tempo(3);
		
		// copiar docente e dependencia
		
		
	if(getDriver().findElement(By.id("chkCopiarDocentePrincipal")).isDisplayed()){
		getDriver().findElement(By.id("chkCopiarDocentePrincipal")).click();
		getDriver().findElement(By.id("chkCopiarDependencia")).click();
		
		System.out.println("passou");
	}else{
		

//		
//			 getDriver().findElement(By.id("sboUnidadeFisicaPadrao")).sendKeys("001");
//			 getDriver().findElement(By.id("sboUnidadeFisicaPadrao")).sendKeys(Keys.TAB);
//			 getDriver().findElement(By.id("sboDependenciaPadrao")).sendKeys("S1");
//			 getDriver().findElement(By.id("sboDependenciaPadrao")).sendKeys(Keys.TAB);
//			 getDriver().findElement(By.id("sboDocentePadrao")).sendKeys("1");
//			 getDriver().findElement(By.id("sboDocentePadrao")).sendKeys(Keys.TAB);
//			 getDriver().findElement(By.id("txbVagasPadrao"));
//			 			 UtilidadesMetodos.tempo(2);
//			 
			  
		 WebElement drpComp = getDriver().findElement(By.id("ddoCodComposicaoTurmaModelo"));
		
		UtilidadesMetodos.buscaDrop(drpComp, "Modelo de criação de turma com Barra");
		UtilidadesMetodos.tempo(3);
		
		WebElement btnAvancar= getDriver().findElement(By.id("metAvancarProximoPasso"));
		btnAvancar.click();
		UtilidadesMetodos.tempo(5);
		
		 assertTrue(getDriver().findElement(By.xpath("//div/table/tbody/tr/td[7]/div")).getText().equals("201/1"));
		
		 
		 getDriver().findElement(By.id("hlkParametrosAssistenteCriacaoTurmas:text")).click();
		 
		 UtilidadesMetodos.implicitWait(30);
		 
		 //Selecionar unidade fisica docente e escolher o grupo de composicao
		 WebElement drpPer1 = getDriver().findElement(By.id("drpPeriodoDestino"));	
		UtilidadesMetodos.buscaDrop(drpPer1, "1 - 1ºSem");
	
		WebElement searchUnid = getDriver().findElement(By.id("sboUnidadeFisicaPadrao"));
		searchUnid.sendKeys("004");
		searchUnid.sendKeys(Keys.TAB);
		
		WebElement searchDepen = getDriver().findElement(By.id("sboDependenciaPadrao"));
		searchDepen.sendKeys("S01");
		searchDepen.sendKeys(Keys.TAB);
		
		WebElement searchDoc = getDriver().findElement(By.id("sboDocentePadrao"));
		searchDoc.sendKeys("1");
		searchDoc.sendKeys(Keys.TAB);
				
		WebElement vagsInpu = getDriver().findElement(By.id("txbVagasPadrao"));
		vagsInpu.sendKeys("11");
		UtilidadesMetodos.tempo(3);
		
		WebElement drpComp1 = getDriver().findElement(By.id("ddoCodComposicaoTurmaModelo"));
		UtilidadesMetodos.buscaDrop(drpComp1, "Modelo de criação de turma com Barra");
		UtilidadesMetodos.tempo(3);

		WebElement btnAvancar1= getDriver().findElement(By.id("metAvancarProximoPasso"));
		btnAvancar1.click();
		UtilidadesMetodos.tempo(5);
		
		getDriver().findElement(By.id("metAvancarProximoPasso:text")).click();
		
		UtilidadesMetodos.implicitWait(30);
		System.out.println(getDriver().findElement(By.xpath("//div[contains(@class, 'x-grid3-cell-inner x-grid3-col-gpfSituacaoSolicitacao')]")).getText());
		UtilidadesMetodos.tempo(5);	
		assertTrue(getDriver().findElement(By.xpath("//div[contains(@class, 'x-grid3-cell-inner x-grid3-col-gpfSituacaoSolicitacao')]")).getText().equals("Finalizado"));
		UtilidadesMetodos.tempo(5);	
	}
	}

}
