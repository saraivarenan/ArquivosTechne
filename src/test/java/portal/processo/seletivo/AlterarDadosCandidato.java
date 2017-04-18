package portal.processo.seletivo;

import org.junit.Test;
import org.openqa.selenium.By;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class AlterarDadosCandidato extends InicializarFirefox {
	
	String userPortal  = Candidato.emailTxt;
	@Test
	public void alterarDados (){
		
		getDriver().get(getPSPortal());

		UtilidadesMetodos.implicitWait(30);
		getDriver().findElement(By.xpath("//*[contains(text(), ' Login ')]")).click();
		UtilidadesMetodos.implicitWait(30);
		getDriver().findElement(By.id("j_username")).sendKeys("teste2326@6001.com");
		getDriver().findElement(By.id("j_password")).sendKeys("123456789");
		getDriver().findElement(By.id("j_enter")).click();
		
		
		UtilidadesMetodos.implicitWait(60);
		
		getDriver().findElement(By.xpath("//*[contains(., 'Não existe nenhum histórico de inscrição.')]"));
		
		getDriver().findElement(By.xpath("//*[contains(@class, 'fa fa-user')]")).click();
		
		UtilidadesMetodos.implicitWait(60);
		getDriver().findElement(By.id("tipoPessoa")).click();
		
		UtilidadesMetodos.tempo(6);
		
	
		getDriver().findElement(By.id("dddFone")).sendKeys("22");
		getDriver().findElement(By.id("dddCelular")).sendKeys("22");
		getDriver().findElement(By.id("telefone")).sendKeys("222");
		getDriver().findElement(By.id("celular")).sendKeys("2222222");
		getDriver().findElement(By.id("email")).clear();
		getDriver().findElement(By.id("email")).sendKeys(userPortal+".edit");
		UtilidadesMetodos.tempo(3);	
	
		getDriver().findElement(By.id("frm-pessoa-fisica")).submit();
		
		
		UtilidadesMetodos.implicitWait(60);
		//UtilidadesMetodos.tempo(3);
		getDriver().findElement(By.xpath("//*[contains(., 'Ok')]")).click();
		UtilidadesMetodos.implicitWait(60);
		
		getDriver().findElement(By.id("tipoSenha")).click();
	
		UtilidadesMetodos.tempo(3);
		
	}

}
