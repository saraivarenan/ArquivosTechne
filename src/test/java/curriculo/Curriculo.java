package curriculo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;
import variaveis.produto.CurriculoVar;
import variaveis.produto.CursoVar;

public class Curriculo extends InicializarFirefox {
	CurriculoVar varCurriculo = new CurriculoVar();
	CursoVar varCurso = new CursoVar();	

	@Test
	public void cadastrarCurriculo (){
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR002D.tp");
		UtilidadesMetodos.users();
		getDriver().findElement(By.id("blkCurriculo.sboCurso")).sendKeys(varCurso.getCurso(), Keys.TAB);
		UtilidadesMetodos.tempo(3);
		
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("ddTurno")).clear();
		getDriver().findElement(By.id("ddTurno")).sendKeys(varCurriculo.getTurno());
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.id("ddTurno")).sendKeys(Keys.ENTER);
		getDriver().findElement(By.id("txtCurriculo02")).sendKeys(varCurriculo.getCurriculo());
		
		getDriver().findElement(By.id("ddAnoIni")).clear();
		getDriver().findElement(By.id("ddAnoIni")).sendKeys(varCurriculo.getAnoPer());
		getDriver().findElement(By.id("ddAnoIni")).sendKeys(Keys.ENTER);
		 
		getDriver().findElement(By.id("txtCreditos02")).sendKeys(varCurriculo.getCreditos());
		getDriver().findElement(By.id("txtAulasPrevistas")).sendKeys(varCurriculo.getHorasPrev());
		getDriver().findElement(By.id("txtDtHomolog02")).sendKeys(varCurriculo.getDataHomolog());
		getDriver().findElement(By.id("ddRegime")).clear();
		getDriver().findElement(By.id("ddRegime")).sendKeys(varCurriculo.getRegime());
		getDriver().findElement(By.id("ddRegime")).sendKeys(Keys.ENTER);
		getDriver().findElement(By.id("txtPrazoIdeal02")).sendKeys(varCurriculo.getIdeal());
		getDriver().findElement(By.id("txtPrazoMax02")).sendKeys(varCurriculo.getMaximo());
		
		getDriver().findElement(By.xpath("//div[2]/div/form/div/div/div/ul/li[2]/a[2]/em/span/span")).click();
		
		getDriver().findElement(By.id("txtCredMinMatr02")).sendKeys(varCurriculo.getNumMinimoCredMat());
		getDriver().findElement(By.id("txtCredMaxMatr02")).sendKeys(varCurriculo.getNumMaximoCredMat());
		getDriver().findElement(By.id("txfAtlzMaxDiscip02")).sendKeys(varCurriculo.getNumMaxDiscAtra());
		getDriver().findElement(By.id("txtCancMaxDiscip02")).sendKeys(varCurriculo.getNumMaxCancCurr());
		getDriver().findElement(By.id("txtTrancConsMax02")).sendKeys(varCurriculo.getConsMaxPerLetDist());
		getDriver().findElement(By.id("txtTrancMax02")).sendKeys(varCurriculo.getTotalMaxPerLetDist());
		getDriver().findElement(By.id("txtTrancMaxDiscip02")).sendKeys(varCurriculo.getMaxTrancDisc());
		
		UtilidadesMetodos.btnSalvar();
		
		 UtilidadesMetodos.tempo(3);
	}

}
