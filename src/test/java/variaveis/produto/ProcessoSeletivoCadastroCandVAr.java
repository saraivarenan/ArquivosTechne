package variaveis.produto;

import utilitarios.Produto.UtilidadesMetodos;

public class ProcessoSeletivoCadastroCandVAr  {
	UtilidadesMetodos util = new UtilidadesMetodos();
	static String emailCandUsado;

	 String nomeCandidato = "nomeCandidato";
	 String tipoDocumento = "CPF";	
	 String cpf = util.mostraResultado();
	 String rg= "1234512362";
	 String dataNascimento = "01011990";
	 String sexo = "Feminino";
	 String DDDtelefone = "11";
	 String DDDcelular = "22";
	 String telefoneNum = "12341234";
	 String CelularNum = "123456789";
	 String emailCand = "teste"+UtilidadesMetodos.compEmail() + "@"+UtilidadesMetodos.compEmail()+".com";
	 String cepCand = "04857620";
	 String Senha= "123456789";
	 String EnderecoNum = "123";
	 
	public String getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDDDtelefone() {
		return DDDtelefone;
	}
	public void setDDDtelefone(String dDDtelefone) {
		DDDtelefone = dDDtelefone;
	}
	public String getDDDcelular() {
		return DDDcelular;
	}
	public void setDDDcelular(String dDDcelular) {
		DDDcelular = dDDcelular;
	}
	public String getTelefoneNum() {
		return telefoneNum;
	}
	public void setTelefoneNum(String telefoneNum) {
		this.telefoneNum = telefoneNum;
	}
	public String getCelularNum() {
		return CelularNum;
	}
	public void setCelularNum(String celularNum) {
		CelularNum = celularNum;
	}
	public String getEmailCand() {
		return emailCand;
	}
	public void setEmailCand(String emailCand) {
		this.emailCand = emailCand;
	}
	public String getCepCand() {
		return cepCand;
	}
	public void setCepCand(String cepCand) {
		this.cepCand = cepCand;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public String getEnderecoNum() {
		return EnderecoNum;
	}
	public void setEnderecoNum(String enderecoNum) {
		EnderecoNum = enderecoNum;
	}
	
	 public String geraEmail() {  
		 emailCandUsado = emailCand;
		 return emailCandUsado;
	        }  
	
	
	
	 
}
