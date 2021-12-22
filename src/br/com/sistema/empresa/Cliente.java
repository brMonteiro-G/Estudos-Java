package br.com.sistema.empresa  ;

public class Cliente implements Autenticavel {
	
	private int senha; 
	private Autenticador autenticador; 
	
	public Cliente() {
		Autenticador autenticador = new Autenticador();
	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}

}
