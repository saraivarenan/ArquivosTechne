package disciplina;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class DocentesHabilitados extends InicializarFirefox{
	
	@Test
	public void cadastrarDocHab (){
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR044D.tp");
		UtilidadesMetodos.users();
		
		getDriver().findElement(By.id("blkDisciplina.sboDisciplina")).sendKeys("A016-CQ0");
		getDriver().findElement(By.id("blkDisciplina.sboDisciplina")).sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.btnNovo();
		getDriver().findElement(By.id("srcNumFunc")).sendKeys("1");
		getDriver().findElement(By.id("srcNumFunc")).sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(2);
		
	}

}
