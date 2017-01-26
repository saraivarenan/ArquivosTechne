package curriculo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilitários.Produto.InicializarFirefox;
import utilitários.Produto.UtilidadesMetodos;

public class UnidadeFisica extends InicializarFirefox {
	@Test
	public void cadastrarUnid (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR014D.tp");
		UtilidadesMetodos.users();
		
		WebElement srcUnidade = getDriver().findElement(By.id("blkCurriculo.sboCurso"));
		srcUnidade.sendKeys("Auto-CQ");
		srcUnidade.sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.id("blkCurriculo.ddoTurno")).clear();
		getDriver().findElement(By.id("blkCurriculo.ddoTurno")).sendKeys("Noturno");
		getDriver().findElement(By.id("blkCurriculo.ddoTurno")).sendKeys(Keys.ENTER);
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.id("blkCurriculo.ddoCurriculo")).clear();
		getDriver().findElement(By.id("blkCurriculo.ddoCurriculo")).sendKeys("AutoCQ");
		getDriver().findElement(By.id("blkCurriculo.ddoCurriculo")).sendKeys(Keys.ENTER);
		
		UtilidadesMetodos.tempo(2);
		
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("srcFaculdade")).sendKeys("001");
		getDriver().findElement(By.id("srcFaculdade")).sendKeys(Keys.TAB);
		getDriver().findElement(By.id("txtDataIni02")).sendKeys("01012016");
		getDriver().findElement(By.id("txtDataFim02")).sendKeys("01012017");

		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(2);
		
	}

}
