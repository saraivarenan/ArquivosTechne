package variaveis.produto;

public class ValorServicoAnoPeriodoVar {
	ServicoValorVar serVar = new ServicoValorVar();
	
	String codServico = serVar.getCodServico();
	String ano = "2017";
	String periodo = "1 - 1º Semestre 2017";
	String custo = "500,00";
	
	public String getCodServico() {
		return codServico;
	}
	public void setCodServico(String codServico) {
		this.codServico = codServico;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getCusto() {
		return custo;
	}
	public void setCusto(String custo) {
		this.custo = custo;
	}
	
	

}
