package br.com.sistema.empresa  ;

public class TesteSistema {

	public static void main(String[] args) {
	
		Gerente gerente = new Gerente(); 
		
		gerente.setSenha(552);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gerente);
		
	
		Autenticavel referencia = new Gerente(); 
		Autenticavel referencia1 = new Cliente(); 
		Autenticavel referencia2 = new Administrador(); 

		

	}

}
