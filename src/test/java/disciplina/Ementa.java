package disciplina;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utilitários.Produto.InicializarFirefox;
import utilitários.Produto.UtilidadesMetodos;

public class Ementa extends InicializarFirefox {

	@Test
	public void cadastrarEmenta (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/curriculos/TCUR043D.tp");
		UtilidadesMetodos.users();
		
		getDriver().findElement(By.id("blkDisciplina.sboDisciplina")).sendKeys("A016-CQ0");
		getDriver().findElement(By.id("blkDisciplina.sboDisciplina")).sendKeys(Keys.TAB);
		UtilidadesMetodos.tempo(2);
		
		UtilidadesMetodos.btnNovo();
		getDriver().findElement(By.id("txbEmenta")).sendKeys("Scrip-Ementa");
		
		getDriver().findElement(By.id("hlkDocumento:text")).click();
		UtilidadesMetodos.tempo(2);
		
		//System.out.println(" twstw: "+ getDriver().switchTo().frame(getDriver().findElements(By.className("t-upload-btn x-form-file-btn ")).get(0)));
		
		
		getDriver().switchTo().frame(getDriver().findElements(By.tagName("iframe")).get(0));
		WebElement bttn = getDriver().findElement(By.xpath("//html/body/div[3]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/form/div/div[1]/div/div"));
		bttn.click();
	UtilidadesMetodos.fileUpload("ManualFlexFieldsLyceum.docx");	
		UtilidadesMetodos.tempo(2);
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(3);
		
		
	}
}
