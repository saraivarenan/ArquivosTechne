package curriculo;

import org.junit.Test;
import org.openqa.selenium.By;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;
import variaveis.produto.TurnoVar;

public class Turno extends InicializarFirefox{
TurnoVar varTurnos = new TurnoVar();

	@Test
	public void cadastroTurno (){
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR009D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.implicitWait(60);
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txbTurno")).sendKeys(varTurnos.getTxbTurno());
		getDriver().findElement(By.id("txbMnemonico")).sendKeys(varTurnos.getTxbMnemonico());
		getDriver().findElement(By.id("txbDescricao")).sendKeys(varTurnos.getTxbDescricao());
		getDriver().findElement(By.id("txbHaraInicio")).sendKeys(varTurnos.getTxbHaraInicio());
		getDriver().findElement(By.id("txbHoraFim")).sendKeys(varTurnos.getTxbHoraFim());
		
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(3);
		
	}
}
