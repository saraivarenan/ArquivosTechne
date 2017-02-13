package Matricula;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.*;


public class MatriculaAluno extends InicializarFirefox{
	
	
	@Test
	public void acessarMatricula (){
		getDriver().get("http://lyc-desenv:8080/Secretaria/Secretaria/operacoesaluno/TACDM001D.tp");
		 UtilidadesMetodos.users();
		 UtilidadesMetodos.implicitWait(60);
		 
		 WebElement srcAluno = getDriver().findElement(By.id("blAluno.srcAluno"));
		 srcAluno.sendKeys("0403112");
		 srcAluno.sendKeys(Keys.TAB);
		 UtilidadesMetodos.implicitWait(60);
		 
		 WebElement adicDisciplina = getDriver().findElement(By.id("metDisciplinasAlteracaoMatricula:text"));
		 adicDisciplina.click();
		 UtilidadesMetodos.implicitWait(60);
		 
		 WebElement drpTipoCurso = getDriver().findElement(By.id("drpTipo"));
		 
		 UtilidadesMetodos.buscaDrop(drpTipoCurso, "Extra Curriculares");
		 UtilidadesMetodos.implicitWait(60);
		 
		 WebElement txtDescDisc = getDriver().findElement(By.id("txtCodNomeDisciplina"));
		 txtDescDisc.sendKeys("comunicação comparada");
		 
		 WebElement btnBuscarDisciplina = getDriver().findElement(By.xpath("//button[contains(text(),'Buscar')]"));
		 btnBuscarDisciplina.click();
		 UtilidadesMetodos.implicitWait(60);
		 
		 WebElement checkDisc = getDriver().findElement(By.xpath("//tbody/tr/td/div/div"));
		 checkDisc.click();
		 UtilidadesMetodos.implicitWait(60);
		 
		
		 WebElement turmaDisc = getDriver().findElement(By.xpath("//div[7]/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]//div[1]/table/tbody/tr/td[1]/div/div"));
	//div/div/div/div/div/div[7]/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div/div
		 
		 turmaDisc.click();
		 UtilidadesMetodos.implicitWait(60);
		 
		WebElement clickProximo = getDriver().findElement(By.id("metProximo:text"));
		clickProximo.click();
		UtilidadesMetodos.implicitWait(60);
		
		WebElement clickConfir = getDriver().findElement(By.id("metProximo:text"));
		clickConfir.click();
		
	}
	
	
	
	
	

}
