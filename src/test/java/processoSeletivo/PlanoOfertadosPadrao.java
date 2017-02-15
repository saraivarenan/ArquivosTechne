package processoSeletivo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class PlanoOfertadosPadrao extends InicializarFirefox{
	
	public static String plano = "CQ-Plano" ;
	public static String descPlano = "Plano ofertados Padrao";

	@Test
	public void cadastrarPlanosOferta (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/processoseletivo/TVEST027D.tp");
		UtilidadesMetodos.users();
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txtPlano02")).sendKeys(plano);
		getDriver().findElement(By.id("txtDescricao02")).sendKeys(descPlano);
		getDriver().findElement(By.id("txtMesInicial02")).sendKeys("1");
		getDriver().findElement(By.id("txtNumParcelas02")).sendKeys("1");
		getDriver().findElement(By.id("ddFormaPagamento")).clear();
		getDriver().findElement(By.id("ddFormaPagamento")).sendKeys("Boleto");
		getDriver().findElement(By.id("ddFormaPagamento")).sendKeys(Keys.ENTER);
		getDriver().findElement(By.id("txtNumParcelasInscr02")).sendKeys("1");
		getDriver().findElement(By.id("txtNDiasVencBol02")).sendKeys("15");
		
		UtilidadesMetodos.tempo(3);
		
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(3);
		getDriver().findElement(By.xpath("//*[contains(text(),'OK')]")).click();
		UtilidadesMetodos.tempo(3);
		
	}
}
