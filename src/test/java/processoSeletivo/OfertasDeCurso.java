package processoSeletivo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class OfertasDeCurso extends InicializarFirefox {
	
	@Test	
	public void cadastrarOfertas (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/processoseletivo/TVEST015D.tp");
		UtilidadesMetodos.users();
		
		getDriver().findElement(By.id("blkConcurso.sboConcurso")).sendKeys(Concurso.txtConcurso);
		getDriver().findElement(By.id("blkConcurso.sboConcurso")).sendKeys(Keys.TAB);
		
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txtDescricaoAbrev02")).sendKeys("OfertaCQ-01");
		getDriver().findElement(By.id("txtDescricaoCompl02")).sendKeys("Descricao Oferta CQ");
		
		UtilidadesMetodos.tempo(3);
		
	}

}
