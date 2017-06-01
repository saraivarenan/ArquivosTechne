package curriculo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class Serie extends InicializarFirefox {
	
	
	@Test
	public void cadastrarSerieCurr (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR010D.tp");
		
		UtilidadesMetodos.users();
		
		WebElement srcSerie = getDriver().findElement(By.id("blkCurriculo.sboCurso"));
		srcSerie.sendKeys("Auto-CQ");
		srcSerie.sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.id("blkCurriculo.ddoTurno")).clear();
		getDriver().findElement(By.id("blkCurriculo.ddoTurno")).sendKeys("Noturno");
		getDriver().findElement(By.id("blkCurriculo.ddoTurno")).sendKeys(Keys.ENTER);
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.id("blkCurriculo.ddoCurriculo")).clear();
		getDriver().findElement(By.id("blkCurriculo.ddoCurriculo")).sendKeys("AutoCQ");
		getDriver().findElement(By.id("blkCurriculo.ddoCurriculo")).sendKeys(Keys.ENTER);
		
		UtilidadesMetodos.tempo(2);
		
		for(int i=1; i<=2; i++){
		// formulário para inserção de um novo registro
			String codSerie =  Integer.toString(i);
		
		UtilidadesMetodos.btnNovo();
		getDriver().findElement(By.id("txtSerie02")).sendKeys(codSerie);;
		getDriver().findElement(By.id("txtDescricao02")).sendKeys("Serie"+i);
		getDriver().findElement(By.id("txtAtlzMaxDiscip02")).sendKeys("1");
		
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(2);
		
		}
	}

}
