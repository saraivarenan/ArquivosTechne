package turmas;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class CadastroComposicaoCodTurma  extends InicializarFirefox{
	
	@Test	
	public void cadastroModCompTurma (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/turmas/TACDT055D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.implicitWait(30);
		UtilidadesMetodos.btnNovo();
		getDriver().findElement(By.id("txbCodigo")).sendKeys("Grupo-Comp");
		getDriver().findElement(By.id("txbDescricao")).sendKeys("Grupo de comp  de turma automatico");
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(7);
	
		//registro contador
	getDriver().findElement(By.xpath("//div[4]/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button")).click();
	getDriver().findElement(By.id("txtOrdemRECCT")).sendKeys("1");
	WebElement drpCampo = getDriver().findElement(By.id("drpTipoRECCT"));
	UtilidadesMetodos.buscaDrop(drpCampo, "Tabela");
	WebElement drpColuna = getDriver().findElement(By.id("drpCampoRECCT"));
	UtilidadesMetodos.buscaDrop(drpColuna, "CONTADOR");
	getDriver().findElement(By.id("txtPosicaoInicialRECCT")).sendKeys("1");;
	UtilidadesMetodos.tempo(3);
	
	getDriver().findElement(By.xpath("//div[4]/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button")).click();;
	UtilidadesMetodos.tempo(3);
	
	//registro constante
	
	getDriver().findElement(By.xpath("//div[4]/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button")).click();
	getDriver().findElement(By.id("txtOrdemRECCT")).sendKeys("2");
	WebElement drpCampo1 = getDriver().findElement(By.id("drpTipoRECCT"));
	UtilidadesMetodos.buscaDrop(drpCampo1, "Tabela");
	WebElement drpColuna2 = getDriver().findElement(By.id("drpCampoRECCT"));
	UtilidadesMetodos.buscaDrop(drpColuna2, "CURSO");
	getDriver().findElement(By.id("txtPosicaoInicialRECCT")).sendKeys("1");
	getDriver().findElement(By.id("txtTamanhoRECCT")).sendKeys("5");
	
	UtilidadesMetodos.tempo(3);
	
	getDriver().findElement(By.xpath("//div[4]/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button")).click();;
	UtilidadesMetodos.tempo(3);

	}

}
