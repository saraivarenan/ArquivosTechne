package processoSeletivo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class AreaConcurso extends InicializarFirefox {
	
	@Test	
	public void cadastrarAreaConcur (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/processoseletivo/TVEST014D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.id("blkConcurso.sboConcurso")).sendKeys(Concurso.txtConcurso);
		getDriver().findElement(By.id("blkConcurso.sboConcurso")).sendKeys(Keys.TAB);;
		
		UtilidadesMetodos.tempo(2);
		
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("srcArea")).sendKeys(Area.area);
		getDriver().findElement(By.id("srcArea")).sendKeys(Keys.TAB);
		
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(2);
		
		
		
		
	}

}
