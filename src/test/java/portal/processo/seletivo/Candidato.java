package portal.processo.seletivo;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;
import variaveis.produto.ProcessoSeletivoCadastroCandVAr;


public class Candidato extends InicializarFirefox {

	ProcessoSeletivoCadastroCandVAr psCandidato = new ProcessoSeletivoCadastroCandVAr ();
	
	public String emailCandidato = psCandidato.geraEmail();
		
	@Test
	public void cadastroCandidato (){
		
		getDriver().get(getPSPortal());
		
		UtilidadesMetodos.implicitWait(30);
		
		getDriver().findElement(By.xpath("//*[contains(@class, 'fa fa-pencil')]")).click();
		UtilidadesMetodos.implicitWait(30);
		
		getDriver().findElement(By.id("nome")).sendKeys(psCandidato.getNomeCandidato());
		
		UtilidadesMetodos.tempo(2);
		WebElement selectDoc = getDriver().findElement(By.id("tipoDoc"));
		new Select(selectDoc).selectByVisibleText(psCandidato.getTipoDocumento());
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.id("cpf")).clear();
		getDriver().findElement(By.id("cpf")).sendKeys(psCandidato.getCpf());
		getDriver().findElement(By.id("rg")).sendKeys(psCandidato.getRg()); 
		UtilidadesMetodos.tempo(2);
		
		getDriver().findElement(By.id("dataNascimento")).click();
		getDriver().findElement(By.id("dataNascimento")).sendKeys(psCandidato.getDataNascimento());
	
		
		WebElement selectSexo = getDriver().findElement(By.id("sexo"));
		new Select(selectSexo).selectByVisibleText(psCandidato.getSexo());
		
		getDriver().findElement(By.id("dddFone")).sendKeys(psCandidato.getDDDtelefone());
		getDriver().findElement(By.id("dddCelular")).sendKeys(psCandidato.getDDDcelular());
		getDriver().findElement(By.id("telefone")).sendKeys(psCandidato.getTelefoneNum());
		getDriver().findElement(By.id("celular")).sendKeys(psCandidato.getCelularNum());
			
		
		getDriver().findElement(By.id("email")).sendKeys(emailCandidato);
		
		
		
		System.out.println("Cadastro: "+emailCandidato);
		
		getDriver().findElement(By.id("cep")).sendKeys(psCandidato.getCepCand());
		getDriver().findElement(By.id("cep")).clear();
		getDriver().findElement(By.id("cep")).sendKeys(psCandidato.getCepCand());
		getDriver().findElement(By.id("cep")).sendKeys(Keys.TAB);
		
		UtilidadesMetodos.tempo(5);
			
		getDriver().findElement(By.id("senha")).sendKeys(psCandidato.getSenha());
		getDriver().findElement(By.id("senhaRepeticao")).sendKeys(psCandidato.getSenha());
		
		getDriver().findElement(By.id("enderecoNum")).sendKeys(psCandidato.getEnderecoNum());
		

		UtilidadesMetodos.tempo(2);
		WebElement btnCadastrar = getDriver().findElement(By.id("form-cadastro-completo"));
		btnCadastrar.submit();
		UtilidadesMetodos.implicitWait(60);
		
		getDriver().findElement(By.xpath("//*[contains(., 'Não existe nenhum histórico de inscrição.')]"));
		UtilidadesMetodos.tempo(3);

		// Alterar Candidato 
		
		getDriver().findElement(By.xpath("//*[contains(@class, 'fa fa-user')]")).click();
		
		UtilidadesMetodos.implicitWait(60);
		getDriver().findElement(By.id("tipoPessoa")).click();
		UtilidadesMetodos.tempo(7);
			
		getDriver().findElement(By.id("dddFone")).sendKeys("22");
		getDriver().findElement(By.id("dddCelular")).sendKeys("22");
		getDriver().findElement(By.id("telefone")).clear();
		getDriver().findElement(By.id("telefone")).sendKeys("22222222");
		getDriver().findElement(By.id("celular")).clear();
		getDriver().findElement(By.id("celular")).sendKeys("222222222");
		getDriver().findElement(By.id("email")).clear();
		getDriver().findElement(By.id("email")).sendKeys(emailCandidato+".edit");
		UtilidadesMetodos.tempo(3);	
	
		getDriver().findElement(By.id("frm-pessoa-fisica")).submit();
		
		UtilidadesMetodos.tempo(4);
		getDriver().findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
		UtilidadesMetodos.tempo(3);
		
		getDriver().findElement(By.id("tipoSenha")).click();
		getDriver().findElement(By.id("senha")).sendKeys("987654321");
		getDriver().findElement(By.id("senhaRepeticao")).sendKeys("987654321");
	
		UtilidadesMetodos.tempo(3);
	}
		
	
}
