package portal.processo.seletivo;

import org.junit.Test;
import org.openqa.selenium.By;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class AlterarDadosCandidato extends InicializarFirefox {
	
	String userPortal  = Candidato.emailTxt;
	@Test
	public void alterarDados (){
		
		getDriver().get("http://lyc-desenv:7030/processoseletivo/r/historico");
		
		getDriver().findElement(By.id("j_username")).sendKeys(userPortal);
		getDriver().findElement(By.id("j_password")).sendKeys("123456789");
		getDriver().findElement(By.id("j_enter")).click();
		
		
		UtilidadesMetodos.implicitWait(60);
		
		getDriver().findElement(By.xpath("//*[contains(., 'Não existe nenhum histórico de inscrição.')]"));
		
		getDriver().findElement(By.xpath("//*[contains(@class, 'fa fa-user')]")).click();
		
		UtilidadesMetodos.implicitWait(60);
		getDriver().findElement(By.id("tipoPessoa")).click();
		UtilidadesMetodos.tempo(5);
		UtilidadesMetodos.implicitWait(60);
		
		getDriver().findElement(By.id("dddFone")).clear();
		getDriver().findElement(By.id("dddFone")).sendKeys("22");
		getDriver().findElement(By.id("dddCelular")).sendKeys("22");
		getDriver().findElement(By.id("telefone")).sendKeys("222");
		getDriver().findElement(By.id("celular")).sendKeys("2222222");
		getDriver().findElement(By.id("email")).sendKeys(userPortal+".edit");
					
		UtilidadesMetodos.tempo(3);
	
		
		
	}

}
