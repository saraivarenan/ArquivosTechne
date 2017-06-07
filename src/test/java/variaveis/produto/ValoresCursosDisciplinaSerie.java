package variaveis.produto;

public class ValoresCursosDisciplinaSerie {
	CursoVar varCurso = new CursoVar();
	TurnoVar varTurno = new TurnoVar();
	CurriculoVar varCurriculo = new CurriculoVar();
	ServicoValorVar servValor = new ServicoValorVar();
	
	
	String cursoValor = varCurso.getCurso();
	String turnoValor = varTurno.getTxbTurno();
	String curriculoValor = varCurriculo.getCurriculo();
	String servicoValor = servValor.getCodServico();
	public String getCursoValor() {
		return cursoValor;
	}
	public void setCursoValor(String cursoValor) {
		this.cursoValor = cursoValor;
	}
	public String getTurnoValor() {
		return turnoValor;
	}
	public void setTurnoValor(String turnoValor) {
		this.turnoValor = turnoValor;
	}
	public String getCurriculoValor() {
		return curriculoValor;
	}
	public void setCurriculoValor(String curriculoValor) {
		this.curriculoValor = curriculoValor;
	}
	public String getServicoValor() {
		return servicoValor;
	}
	public void setServicoValor(String servicoValor) {
		this.servicoValor = servicoValor;
	}
	
}
