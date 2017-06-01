package curriculo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;
import variaveis.produto.CursoVar;

public class Cursos extends InicializarFirefox{
	CursoVar varCurso = new CursoVar();

	@Test
	public void CadastrarDisciplina() {

		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR001D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.implicitWait(60);
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txtCurso")).sendKeys(varCurso.getCurso());
		getDriver().findElement(By.id("txtNomeCurso")).sendKeys(varCurso.getNomeCurso());
		getDriver().findElement(By.id("txtMnemonico")).sendKeys(varCurso.getCursoMne());
		getDriver().findElement(By.id("txtTitulo")).sendKeys(varCurso.getTitulo());
		WebElement srcUnidadeResp = getDriver().findElement(By.id("srcUnidadeResp"));
		srcUnidadeResp.sendKeys("1");
		srcUnidadeResp.sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(2);
		
		getDriver().findElement(By.id("txtDecreto")).sendKeys(varCurso.getDecreto());
		
		WebElement ddNivel = getDriver().findElement(By.id("ddNivel"));
		WebElement ddDepartamento = getDriver().findElement(By.id("ddDepartamento"));
		
		UtilidadesMetodos.buscaDrop(ddNivel, "SUPERIOR");
		ddDepartamento.clear();
		ddDepartamento.sendKeys("GERAL");
		ddDepartamento.sendKeys(Keys.ENTER);
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(3);
		
	}

}
