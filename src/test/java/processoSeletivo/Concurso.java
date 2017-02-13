package processoSeletivo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class Concurso extends InicializarFirefox{
	
	public static String txtConcurso = "PSTesteCQ";
	private String txtDescrição = "Processo Seletivo para teste CQ";
	private String txtTipoClassif = "Média";
	private String drpAno = "2017";
	private String drpPeriodo = "1 - 1ºSem";
	private String dateInicConcur = "01012017";
	private String dateTermConcur = "01122017";
	private String numMaxDig = "1";
	private String numMaxopc = "0";

	
	
	
	@Test
	public void cadastrarConcurso(){
		
	getDriver().get(getUrl()+"/Secretaria/Secretaria/processoseletivo/TVEST013D.tp");
	
	UtilidadesMetodos.users();
	
	UtilidadesMetodos.implicitWait(60);	
	UtilidadesMetodos.btnNovo();
	
	//campo Concurso
	getDriver().findElement(By.id("txtConcurso02")).sendKeys(txtConcurso);
	
	// Campo Descrição
	getDriver().findElement(By.id("txtDescricao02")).sendKeys(txtDescrição);
	
	
	
	UtilidadesMetodos.tempo(1);
	
	// Campo Tipo de Classificação
	getDriver().findElement(By.id("ddTipoClassificacao")).clear();

	getDriver().findElement(By.id("ddTipoClassificacao")).sendKeys(txtTipoClassif);
	getDriver().findElement(By.id("ddTipoClassificacao")).sendKeys(Keys.ENTER);
	
	//Campo Ano
	getDriver().findElement(By.id("ddAno")).clear();
	getDriver().findElement(By.id("ddAno")).sendKeys(drpAno);
	getDriver().findElement(By.id("ddAno")).sendKeys(Keys.ENTER);
	
	//Campo Periodo
 WebElement drp1Periodo=	getDriver().findElement(By.id("ddPeriodo"));
UtilidadesMetodos.buscaDrop(drp1Periodo, drpPeriodo);
	
	//Campo Inicio  do Concurso
	getDriver().findElement(By.id("txtDtInicio02")).sendKeys(dateInicConcur);
	
	//Campo data de termino
	getDriver().findElement(By.id("txtDtFim02")).sendKeys(dateTermConcur);	
	
	// Campo Maximo  de Dígitos 
	getDriver().findElement(By.id("ddNumDigCod")).clear();
	getDriver().findElement(By.id("ddNumDigCod")).sendKeys(numMaxDig);
	getDriver().findElement(By.id("ddNumDigCod")).sendKeys(Keys.ENTER);
	
	//Campo Máximo Opções
	getDriver().findElement(By.id("txtNumMaxOpcoes02")).sendKeys(numMaxopc);
	
	getDriver().findElement(By.id("ckbInscrAberta")).click();

	getDriver().findElement(By.id("ckbDisponivelWeb")).click();	
	
	UtilidadesMetodos.tempo(2);

	UtilidadesMetodos.btnSalvar();
	
	UtilidadesMetodos.tempo(2);
	
	
		
	}

}
