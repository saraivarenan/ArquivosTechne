package disciplina;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class Disciplina extends InicializarFirefox {
	
	@Test
	public void cadastrarDisciplina (){
		
		
		//Disciplina com Conceito
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR004D.tp");
		UtilidadesMetodos.users();
		
		
		for (int i=0; i<2; i++){
		
			getDriver().navigate().to(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR004D.tp");
		UtilidadesMetodos.implicitWait(60);
		

		
		//Fazer o cadastro de uma disciplina
		UtilidadesMetodos.btnNovo();
		
		
		getDriver().findElement(By.id("txbDisciplina")).sendKeys("A016-CQ"+i);
		
		getDriver().findElement(By.id("txbNome")).sendKeys("CQ- Script"+i);
		
	 WebElement srcUnidade=	getDriver().findElement(By.id("srcFaculdade"));
	 srcUnidade.sendKeys("1");
	 srcUnidade.sendKeys(Keys.TAB);
	 UtilidadesMetodos.tempo(2);
	  
	 WebElement drpDepto = getDriver().findElement(By.id("drpDepto"));
	 drpDepto.clear();
	 drpDepto.sendKeys("GERAL");
	 drpDepto.sendKeys(Keys.ENTER);

	 UtilidadesMetodos.tempo(2);
	 getDriver().findElement(By.id("txbCreditos")).sendKeys("10");
	 UtilidadesMetodos.tempo(2);
	 
	 getDriver().findElement(By.id("ckbAtiva")).click();
	 
	 getDriver().findElement(By.xpath("//div[2]/div/form/div/div/div/ul/li[2]/a[2]/em/span/span")).click();
	 
	 getDriver().findElement(By.id("ckbTemNota")).click();
	 
	 WebElement drpConceitoNota = getDriver().findElement(By.id("drpGrupoNota"));
	 WebElement drpConceitoMedia = getDriver().findElement(By.id("drpGrupoMedia"));
	 
	 if(i == 0){
	 
	 String conteDrp = curriculo.ConceitosNotas.getGrupoConceito() +" - "+curriculo.ConceitosNotas.getdescConceito();
	 System.out.println(conteDrp);
	 UtilidadesMetodos.buscaDrop(drpConceitoNota, conteDrp);
	 UtilidadesMetodos.buscaDrop(drpConceitoMedia, conteDrp);
	 }
	 
	 
	 getDriver().findElement(By.id("txbNotaMaxima")).sendKeys("10");
	 getDriver().findElement(By.id("txbMediaMaxima")).sendKeys("10");
	 getDriver().findElement(By.id("txbPrazoRevisaoProva")).sendKeys("10");

	 UtilidadesMetodos.btnSalvar();
	 UtilidadesMetodos.tempo(2);
	 
		}
	}

}
