package curriculo.gradeCurricular;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import curriculo.Cursos;
import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;
import variaveis.produto.CurriculoVar;
import variaveis.produto.CursoVar;
import variaveis.produto.TurnoVar;

public class GradeCurricular extends InicializarFirefox {
	
	TurnoVar varTurno =  new TurnoVar();
	CurriculoVar varCurriculo = new CurriculoVar();
	CursoVar varCurso = new CursoVar();
	
	
	
	@Test
	public void cadastrarGradeCurricular(){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR003D.tp");
		UtilidadesMetodos.users();
		UtilidadesMetodos.implicitWait(30);
		getDriver().findElement(By.id("sboCurso")).sendKeys(varCurso.getCurso());
		getDriver().findElement(By.id("sboCurso")).sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(2);
		
		
		WebElement drpTurno = getDriver().findElement(By.id("ddoTurno"));
		drpTurno.clear();
		drpTurno.sendKeys(varTurno.getTxbDescricao());
		UtilidadesMetodos.tempo(1);
		drpTurno.sendKeys(Keys.ENTER);
		UtilidadesMetodos.tempo(1);
		
		WebElement drpCurriculo = getDriver().findElement(By.id("ddoCurriculo"));
		drpCurriculo.clear();
		drpCurriculo.sendKeys(varCurriculo.getCurriculo());
		UtilidadesMetodos.tempo(2);
		drpCurriculo.sendKeys(Keys.ENTER);
		UtilidadesMetodos.tempo(2);
	}

}
