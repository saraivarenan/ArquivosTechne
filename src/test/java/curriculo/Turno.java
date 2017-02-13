package curriculo;

import org.junit.Test;
import org.openqa.selenium.By;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class Turno extends InicializarFirefox{

	@Test
	public void cadastroTurno (){
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR009D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.implicitWait(60);
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txbTurno")).sendKeys("Ascript");
		getDriver().findElement(By.id("txbMnemonico")).sendKeys("AS");
		getDriver().findElement(By.id("txbDescricao")).sendKeys("Script de automação CQ");
		getDriver().findElement(By.id("txbHaraInicio")).sendKeys("0000");
		getDriver().findElement(By.id("txbHoraFim")).sendKeys("1200");
		
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(3);
		
	
		
	}
}
