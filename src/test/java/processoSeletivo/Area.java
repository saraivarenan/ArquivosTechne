package processoSeletivo;

import org.junit.Test;
import org.openqa.selenium.By;

import utilitarios.Produto.InicializarFirefox;
import utilitarios.Produto.UtilidadesMetodos;

public class Area extends InicializarFirefox {
	
	public static String area = "CQ-AREA";
	private String descricao = "Processo seletivo CQ";
	
	@Test
	public void cadastrarArea (){
		
		getDriver().get(getUrl()+"/Secretaria/Secretaria/processoseletivo/TVEST001D.tp");
		UtilidadesMetodos.users();
		
		UtilidadesMetodos.tempo(2);
	
		UtilidadesMetodos.btnNovo();
		
		getDriver().findElement(By.id("txbArea")).sendKeys(area);		
		getDriver().findElement(By.id("txbDescricao")).sendKeys(descricao);
		UtilidadesMetodos.tempo(2);
		
		UtilidadesMetodos.btnSalvar();
		UtilidadesMetodos.tempo(2);
		
		
	
	}
	}
