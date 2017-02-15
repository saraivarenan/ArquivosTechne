package processoSeletivo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class SubGruposOfertas extends InicializarFirefox {
	static String grpOferta = "CQ-GR";
	static String descGrpOferta = "Descricao CQ subgrupos ofertas";
	
	@Test
	public void cadastrarSubOfertas (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/processoseletivo/TVEST039D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.implicitWait(30);
		
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txbGrupoOferta")).sendKeys(grpOferta);
		getDriver().findElement(By.id("txbDescricao")).sendKeys(descGrpOferta);
		UtilidadesMetodos.tempo(3);
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(2);
		
		getDriver().findElement(By.id("sboGruposOfertas")).sendKeys(grpOferta);
		getDriver().findElement(By.id("sboGruposOfertas")).sendKeys(Keys.TAB);
		
		UtilidadesMetodos.tempo(2);
		getDriver().findElement(By.xpath("//div[8]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button")).click();
		
		getDriver().findElement(By.id("txtSubGrupo02")).sendKeys("SubGrp- CQ");;
		getDriver().findElement(By.id("txtDescricao03")).sendKeys("Descricao sub grupo ofertas");;
		UtilidadesMetodos.tempo(3);
		
	getDriver().findElement(By.xpath("//div[8]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button")).click();
		
	
	//div[8]/div[2]/div/div/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button
		
		UtilidadesMetodos.tempo(3);
		
		
	}

}
