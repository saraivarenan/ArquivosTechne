package curriculo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class Curriculo extends InicializarFirefox {
	static String turno= "NOTURNO";
	static String curriculo= "AutoCQ";
	static String anoPer = "2016";
	static String Per = "0 - ANUAL";
	static String creditos = "10";
	static String horasPrev = "10";
	static String dataHomolog = "01012016";
	static String regime = "Anual";
	static String situacao = "Aberta";
	static String ideal = "10";
	static String maximo = "15";
	static String numMinimoCredMat = "5";
	static String numMaximoCredMat = "11";
	static String numMaxDiscAtra = "2";
	static String numMaxCancCurr = "2";
	static String consMaxPerLetDist = "10";
	static String TotalMaxPerLetDist ="10";
	static String MaxTrancDisc = "5";	
	@Test
	public void cadastrarCurriculo (){
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR002D.tp");
		UtilidadesMetodos.users();
		getDriver().findElement(By.id("blkCurriculo.sboCurso")).sendKeys(Cursos.curso, Keys.TAB);
		UtilidadesMetodos.tempo(3);
		
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("ddTurno")).clear();
		getDriver().findElement(By.id("ddTurno")).sendKeys(turno);
		getDriver().findElement(By.id("ddTurno")).sendKeys(Keys.ENTER);
		getDriver().findElement(By.id("txtCurriculo02")).sendKeys(curriculo);
		
		getDriver().findElement(By.id("ddAnoIni")).clear();
		getDriver().findElement(By.id("ddAnoIni")).sendKeys(anoPer);
		getDriver().findElement(By.id("ddAnoIni")).sendKeys(Keys.ENTER);
		 
		getDriver().findElement(By.id("txtCreditos02")).sendKeys(creditos);
		getDriver().findElement(By.id("txtAulasPrevistas")).sendKeys(horasPrev);
		getDriver().findElement(By.id("txtDtHomolog02")).sendKeys(dataHomolog);
		getDriver().findElement(By.id("ddRegime")).clear();
		getDriver().findElement(By.id("ddRegime")).sendKeys(regime);
		getDriver().findElement(By.id("ddRegime")).sendKeys(Keys.ENTER);
		getDriver().findElement(By.id("txtPrazoIdeal02")).sendKeys(ideal);
		getDriver().findElement(By.id("txtPrazoMax02")).sendKeys(maximo);
		
		getDriver().findElement(By.xpath("//div[2]/div/form/div/div/div/ul/li[2]/a[2]/em/span/span")).click();
		
		getDriver().findElement(By.id("txtCredMinMatr02")).sendKeys(numMinimoCredMat);
		getDriver().findElement(By.id("txtCredMaxMatr02")).sendKeys(numMaximoCredMat);
		getDriver().findElement(By.id("txfAtlzMaxDiscip02")).sendKeys(numMaxDiscAtra);
		getDriver().findElement(By.id("txtCancMaxDiscip02")).sendKeys(numMaxCancCurr);
		getDriver().findElement(By.id("txtTrancConsMax02")).sendKeys(consMaxPerLetDist);
		getDriver().findElement(By.id("txtTrancMax02")).sendKeys(TotalMaxPerLetDist);
		getDriver().findElement(By.id("txtTrancMaxDiscip02")).sendKeys(MaxTrancDisc);
		
		UtilidadesMetodos.btnSalvar();
		
		 UtilidadesMetodos.tempo(3);
	}

}
