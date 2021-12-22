package br.com.sistema.empresa  ;
public class SistemaInterno {
	
	
	private int senha = 552; 
	
	public void autentica(Autenticavel fa){
		
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou){
			System.out.println("Você está autorizado a entrar no sistema");
		}else {
			System.out.println("Você não está autorizado a entrar no sistema");
		}
		
	}

}
