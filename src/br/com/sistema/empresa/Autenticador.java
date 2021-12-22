package br.com.sistema.empresa  ;


public class Autenticador {

	private int senha = 222; 
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false; 
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha ; 
	}
	
}
