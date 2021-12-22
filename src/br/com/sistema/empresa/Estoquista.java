package br.com.sistema.empresa  ;

public class Estoquista extends Funcionario {

	
	public double getBonificacao() {
		return 50 + super.getSalario(); 
	}
	
}
