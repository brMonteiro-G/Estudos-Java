
public class Administrador extends Funcionario implements Autenticavel {
	
	private int senha; 
	private Autenticador autenticador; 
	
	public Administrador() {
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
	
	public double getBonificacao(){
		return 150 + super.getSalario(); 
	}
}
