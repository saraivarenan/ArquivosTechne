package portal.processo.seletivo;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class Candidato extends InicializarFirefox {
	
	static String emailTxt= "teste"+UtilidadesMetodos.compEmail() + "@"+UtilidadesMetodos.compEmail()+ ".com";
	@Test
	public void cadastroCandidato (){
		
		getDriver().get(getPSPortal());
		
		UtilidadesMetodos.implicitWait(30);
		
		getDriver().findElement(By.xpath("//*[contains(@class, 'fa fa-pencil')]")).click();
		UtilidadesMetodos.implicitWait(30);
		
		getDriver().findElement(By.id("nome")).sendKeys("Candidato CQ");
		
		UtilidadesMetodos.tempo(2);
		WebElement selectDoc = getDriver().findElement(By.id("tipoDoc"));
		new Select(selectDoc).selectByVisibleText("CPF");
		UtilidadesMetodos.tempo(2);
		
		getDriver().findElement(By.id("cpf")).sendKeys(UtilidadesMetodos.gerarCPF());
		getDriver().findElement(By.id("rg")).sendKeys("12365498563");
		UtilidadesMetodos.tempo(2);
		
		getDriver().findElement(By.id("dataNascimento")).click();
		getDriver().findElement(By.id("dataNascimento")).sendKeys("01011990");
	
		
		WebElement selectSexo = getDriver().findElement(By.id("sexo"));
		new Select(selectSexo).selectByVisibleText("Feminino");
		
		getDriver().findElement(By.id("dddFone")).sendKeys("11");
		getDriver().findElement(By.id("dddCelular")).sendKeys("11");
		getDriver().findElement(By.id("telefone")).sendKeys("52632554");
		getDriver().findElement(By.id("celular")).sendKeys("123456789");
			
		
		getDriver().findElement(By.id("email")).sendKeys(emailTxt);
		
		
		getDriver().findElement(By.id("cep")).sendKeys("04857320");
		getDriver().findElement(By.id("cep")).sendKeys(Keys.TAB);
		
		UtilidadesMetodos.tempo(5);
			
		getDriver().findElement(By.id("senha")).sendKeys("123456789");
		getDriver().findElement(By.id("senhaRepeticao")).sendKeys("123456789");
		
		getDriver().findElement(By.id("enderecoNum")).sendKeys("19");
		
		System.out.println(emailTxt);
		UtilidadesMetodos.tempo(2);
		WebElement btnCadastrar = getDriver().findElement(By.id("form-cadastro-completo"));
		btnCadastrar.submit();
		UtilidadesMetodos.implicitWait(60);
		
		getDriver().findElement(By.xpath("//*[contains(., 'Não existe nenhum histórico de inscrição.')]"));
	}

}
