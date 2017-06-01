package mapeamento.elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import curriculo.Cursos;
import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class ElementosPageCurriculo extends InicializarFirefox {
	
	
	public void curriculo (){
	getDriver().findElement(By.id("blkCurriculo.sboCurso")).sendKeys(Cursos.curso, Keys.TAB);
	UtilidadesMetodos.tempo(3);
	}
	public void btnNovoRecordPanel1 () {
	UtilidadesMetodos.btnNovo();
	}
	public void turno () {
	getDriver().findElement(By.id("ddTurno")).clear();
	getDriver().findElement(By.id("ddTurno")).sendKeys(variaveis.produto.CurriculoVar.getTurno());
	public void () {
	getDriver().findElement(By.id("ddTurno")).sendKeys(Keys.ENTER);
	public void () {
	getDriver().findElement(By.id("txtCurriculo02")).sendKeys(variaveis.produto.CurriculoVar.getCurriculo());
	public void () {
	getDriver().findElement(By.id("ddAnoIni")).clear();
	getDriver().findElement(By.id("ddAnoIni")).sendKeys(variaveis.produto.CurriculoVar.getAnoPer());
	getDriver().findElement(By.id("ddAnoIni")).sendKeys(Keys.ENTER);
	public void () {
	getDriver().findElement(By.id("txtCreditos02")).sendKeys(variaveis.produto.CurriculoVar.getCreditos());
	public void () {
	getDriver().findElement(By.id("txtAulasPrevistas")).sendKeys(variaveis.produto.CurriculoVar.getHorasPrev());
	getDriver().findElement(By.id("txtDtHomolog02")).sendKeys(variaveis.produto.CurriculoVar.getDataHomolog());
	getDriver().findElement(By.id("ddRegime")).clear();
	getDriver().findElement(By.id("ddRegime")).sendKeys(variaveis.produto.CurriculoVar.getRegime());
	getDriver().findElement(By.id("ddRegime")).sendKeys(Keys.ENTER);
	getDriver().findElement(By.id("txtPrazoIdeal02")).sendKeys(variaveis.produto.CurriculoVar.getIdeal());
	getDriver().findElement(By.id("txtPrazoMax02")).sendKeys(variaveis.produto.CurriculoVar.getMaximo());
	
	getDriver().findElement(By.xpath("//div[2]/div/form/div/div/div/ul/li[2]/a[2]/em/span/span")).click();
	
	getDriver().findElement(By.id("txtCredMinMatr02")).sendKeys(variaveis.produto.CurriculoVar.getNumMinimoCredMat());
	getDriver().findElement(By.id("txtCredMaxMatr02")).sendKeys(variaveis.produto.CurriculoVar.getNumMaximoCredMat());
	getDriver().findElement(By.id("txfAtlzMaxDiscip02")).sendKeys(variaveis.produto.CurriculoVar.getNumMaxDiscAtra());
	getDriver().findElement(By.id("txtCancMaxDiscip02")).sendKeys(variaveis.produto.CurriculoVar.getNumMaxCancCurr());
	getDriver().findElement(By.id("txtTrancConsMax02")).sendKeys(variaveis.produto.CurriculoVar.getConsMaxPerLetDist());
	getDriver().findElement(By.id("txtTrancMax02")).sendKeys(TotalMaxPerLetDist);
	getDriver().findElement(By.id("txtTrancMaxDiscip02")).sendKeys(MaxTrancDisc);

}
