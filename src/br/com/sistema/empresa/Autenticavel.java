package br.com.sistema.empresa  ;

public abstract interface Autenticavel  {
	
	public abstract void setSenha(int senha) ;
	
	public abstract boolean autentica(int senha) ;
	
	
/*	
	@Override
	public double getBonificacao() {
		
		return 0;
	}
*/
}
