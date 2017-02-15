package curriculo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class Cursos extends InicializarFirefox{
	static String curso = "Auto-CQ";
	static String nomeCurso = "Curso- CQ" ;
	static String cursoMne = "CQCur";
	static String titulo = "Curso-Aut";

	@Test
	public void CadastrarDisciplina() {

		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR001D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.implicitWait(60);
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txtCurso")).sendKeys(curso);
		getDriver().findElement(By.id("txtNomeCurso")).sendKeys(nomeCurso);
		getDriver().findElement(By.id("txtMnemonico")).sendKeys(cursoMne);
		getDriver().findElement(By.id("txtTitulo")).sendKeys(titulo);
		WebElement srcUnidadeResp = getDriver().findElement(By.id("srcUnidadeResp"));
		srcUnidadeResp.sendKeys("1");
		srcUnidadeResp.sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(2);
		
		getDriver().findElement(By.id("txtDecreto")).sendKeys("Teste Auto CQ Script");
		
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
