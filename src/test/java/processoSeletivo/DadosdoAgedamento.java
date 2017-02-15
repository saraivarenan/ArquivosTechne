package processoSeletivo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class DadosdoAgedamento extends InicializarFirefox {
	
	@Test
	public void cadasDadosAgend(){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/processoseletivo/TVEST020D.tp");
		
		UtilidadesMetodos.users();
		getDriver().findElement(By.id("blkConcurso.sboConcurso")).sendKeys(Concurso.txtConcurso);
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txtHorarioProva02")).sendKeys("1000");
		getDriver().findElement(By.id("srcUnidade")).sendKeys("1");
		getDriver().findElement(By.id("srcUnidade")).sendKeys(Keys.TAB);
		
		getDriver().findElement(By.id("txtData02")).sendKeys("01072017");
		
		getDriver().findElement(By.id("txtHoraInicio02")).sendKeys("1015");
		
		getDriver().findElement(By.id("txtNumVagas02")).sendKeys("15");
		
		UtilidadesMetodos.tempo(3);
		
		UtilidadesMetodos.btnSalvar();
		
		UtilidadesMetodos.tempo(2);
		
	}

}
